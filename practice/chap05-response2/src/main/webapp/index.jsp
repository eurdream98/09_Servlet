<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="headers">응답 헤더 확인하기</a>
<a href="errorcontroller">에러 컨트롤</a>
<form action="test3" method="post">
  <input type="text" name="id"/>
  <input type="password" name="password"/>
  <button type="submit">제출</button>
</form>
</body>
</html>