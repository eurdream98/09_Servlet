package com.ohgiraffers.chap10session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session")
public class Test1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        System.out.println("session : "+session);
        session.setMaxInactiveInterval(60*10);
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        System.out.println("firstName,pwd"+firstName+firstName);
        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);
        resp.sendRedirect("test");
    }
}
