<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="request-service">get방식 요청</a>
<form action="request-service" method="post">
  <input type="submit" value="post방식 요청"/>
</form>
</body>
</html>