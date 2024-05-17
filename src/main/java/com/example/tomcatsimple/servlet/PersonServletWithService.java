package com.example.tomcatsimple.servlet;

import com.example.tomcatsimple.model.Person;
import com.example.tomcatsimple.service.PersonService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "personServlet", value = "/person")
//public class PersonServletWithService extends HttpServlet {
//    private final PersonService personService = PersonService.getInstance();
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        String id = request.getParameter("id");
//        Person ivan = personService.getById(Integer.parseInt(id));
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + ivan.getId() + "</h1>");
//        out.println("<h2>" + ivan.getEmail() + "</h2>");
//        out.println("<h3>" + ivan.getFirstname() + "</h3>");
//        out.println("</body></html>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
//
//    public void destroy() {
//    }
//}