package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                PrintWriter out = response.getWriter();
                out.println("This is my first Hello World Web Application using Tomcat/Servlets - UPDATED ON 10/28!!!");
        }
}
