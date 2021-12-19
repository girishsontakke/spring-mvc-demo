<%--
  Created by IntelliJ IDEA.
  User: girish
  Date: 08/12/21
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="process-form" modelAttribute="customer">
        <form:label path="name">Enter your name: </form:label>
        <form:input path="name" />
        <form:errors cssClass="error" path="name" />
        <br/>
        <form:label path="age">Enter your age: </form:label>
        <form:input path="age" />
        <form:errors cssClass="error" path="age" />
        <br />
        <form:label path="postalCode" >Enter your postalCode: </form:label>
        <form:input path="postalCode" />
        <form:errors cssClass="error" path="postalCode" />
        <br />

        <form:label path="freePasses" >Free Passes: </form:label>
        <form:input path="freePasses" />
        <form:errors cssClass="error" path="freePasses" />
        <br />

        <form:label path="courseCode" >Free Passes: </form:label>
        <form:input path="courseCode" />
        <form:errors cssClass="error" path="courseCode" />
        <br />

        <input type="submit" value="submit" />
    </form:form>
</body>
</html>
