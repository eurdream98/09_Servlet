<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action="test" method="post">
  <input type="text" name="id"/>
  <input type="password" name="pw"/>
  <button type="submit">제출</button>
</form>
</body>
</html>