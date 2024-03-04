package com.ohgiraffers.chap09cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie")
public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        Cookie firstNameC = new Cookie("firstName",firstName);
        Cookie lastNameC = new Cookie("lastName",lastName);
        resp.addCookie(firstNameC);
        resp.addCookie(lastNameC);
        resp.sendRedirect("test");
    }
}
