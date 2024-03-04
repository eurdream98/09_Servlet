package com.ohgiraffers.chap03parametelecturesource.section02.formdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getCharacterEncoding());

        System.out.println(req.getCharacterEncoding());
        req.setCharacterEncoding("UTF8");
        String name = req.getParameter("name");
        System.out.println("이름 : "+name);

        /*get Parameter 메소드는 반환 타입이 문자열이다. 다른 형식의 값이 필요하다면 parsing한다.*/
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("나이 : "+age);

        /*날짜와 관련 된 부분도 parsing이 필요하다.*/
        java.sql.Date birthday = java.sql.Date.valueOf(req.getParameter("birthday"));
        System.out.println("생일 : "+birthday);

        /*라디오 버튼으로 전달 된 값은 여러 값 중 선택한 하나의 값만 전달 되므로 parameter로 전달 된 값을
         * 꺼내기만 하면 된다.*/
        String gender = req.getParameter("gender");
        System.out.println("성별 : "+gender);

        String national = req.getParameter("national");
        System.out.println("국적 : "+national);

        /*checkbox는 다중으로 입력을 받을 수 있으므로 선택 된 값이 문자열 배열로 전달 된다.
         * getParameterValues 메소드를 이용한다.*/
        String[] hobbies = req.getParameterValues("hobbies");
        System.out.print("취미 : ");
        for(String hobby:hobbies){
            System.out.println(hobby + "");
        }
    }
}
