<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css" />
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>
<a href="home/name-form">Fill the form</a>
<br>
<a href="student/show-form">Fill the student form</a>
<br/>
<a href="customer/show-form">Fill the customer form</a>

</body>
</html>