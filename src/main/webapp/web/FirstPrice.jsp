<%--
  Created by IntelliJ IDEA.
  User: Vipin Sharma
  Date: 26-03-2024
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="https://owasp.org/www-project-csrfguard/Owasp.CsrfGuard.tld" prefix="csrf" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Price One</title>
</head>
<body>
    <div>Welcome to ${priceManager.getName()}</div>
    <form:form action="priceFirst" method="post" modelAttribute="price">
        <form:input path="price" />
        <input type="hidden" name="<csrf:tokenname/>" value="<csrf:tokenvalue/>"/>
        <form:button type="submit" name="submit" value="Submit" >Submit</form:button>
    </form:form>
</body>
</html>
