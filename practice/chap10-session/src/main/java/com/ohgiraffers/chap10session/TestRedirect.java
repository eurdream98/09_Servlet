package com.ohgiraffers.chap10session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestRedirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println("session : "+session);

        String firstName = (String)req.getAttribute("firstName");
        String lastName = (String)req.getAttribute("lastName");

        System.out.println("firstName,lastName"+firstName+lastName);
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
