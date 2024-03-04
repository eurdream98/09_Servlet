<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action="cookie" method="post">
  <input type="text" name="firstName"/>
  <input type="text" name="lastName"/>
  <input type="submit" value="제출"/>

</form>
</body>
</html>