package com.ohgiraffers.chap03request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/querystring")
public class Parameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("name : "+name);
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("age : "+age);
        Date date = Date.valueOf(req.getParameter("birthday"));
        System.out.println("date : "+date);
        String gender = req.getParameter("gender");
        System.out.println("gender : "+gender );
        String nation = req.getParameter("national");
        System.out.println("nation : "+nation);
        String[] arr = req.getParameterValues("hobbies");
        for(String hobby : arr){
            System.out.println("hobby : "+hobby);
        }


    }
}
