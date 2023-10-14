package com.jetbrains.hellowecapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static java.awt.SystemColor.text;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    List<String> list=new ArrayList<String>();
    List<String> list1=new ArrayList<String>();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String message1 = request.getParameter("message");

        list.add(username);
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list1.add(message1);
        list1.add("今天天气怎么样？");

        response.setContentType("text/html;charset=UTF-8");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (String str : list) {
            System.out.println("<span >"+list+"<span>");

        }
        System.out.println("wosdn");


        out.println("</body></html>");

    }

    public void destroy() {
    }
}