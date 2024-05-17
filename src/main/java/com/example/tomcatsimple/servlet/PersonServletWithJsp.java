package com.example.tomcatsimple.servlet;

import com.example.tomcatsimple.service.PersonService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "personServlet", value = "/person")
public class PersonServletWithJsp extends HttpServlet {
    private final PersonService personService = PersonService.getInstance();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String id = request.getParameter("id");

        request.setAttribute("person", personService.getById(Integer.parseInt(id)));

        request.getRequestDispatcher("/WEB-INF/jsp/person.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}