package com.ohgiraffers.chap09cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class Test2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        String firstName="";
        String lastName="";
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("firstName")){
                firstName = cookie.getValue();
            }else{
                lastName = cookie.getValue();
            }
        }
        resp.setContentType("text/html; charset=UTF-8");
        StringBuilder sb = new StringBuilder();
        sb.append("<!doctype html>")
                .append("<html>")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append("<h1>")
                .append(firstName+","+lastName)
                .append("</h1")
                .append("</body>")
                .append("</html>");
        PrintWriter out = resp.getWriter();
        out.print(sb);
        out.flush();
        out.close();

    }
}
