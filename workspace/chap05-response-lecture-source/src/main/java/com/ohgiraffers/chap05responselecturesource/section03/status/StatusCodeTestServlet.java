package com.ohgiraffers.chap05responselecturesource.section03.status;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendError(404,"오류다");
        resp.sendError(500,"서버 내부 오류입니다. 서버 오류는 개발자의 잘못이에요.");
    }

}
