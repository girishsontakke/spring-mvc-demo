<%--
  Created by IntelliJ IDEA.
  User: girish
  Date: 03/12/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
    <form:form action="process-form" modelAttribute="student" >
        <label> First Name: </label>
        <form:input path="firstName" />
        <br/>
        <label> Last Name: </label>
        <form:input path="lastName" />
        <br />
<%--        <form:select name="fav-country" path="favCountry" >--%>
<%--            <form:option value="India" />--%>
<%--            <form:option value="USA" />--%>
<%--            <form:option value="Canada" />--%>
<%--            <form:option value="Australia" />--%>
<%--        </form:select>--%>

        <form:select path="favCountry" >
            <form:options items="${student.countryMap}" />
        </form:select>
        <br />

        <form:radiobuttons path="favLanguage" items="${student.languageArray}" />
        <br />

        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
