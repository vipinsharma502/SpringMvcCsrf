<%@ page import="com.vip.model.PriceManager" %>
<%@ page import="com.vip.model.Price" %><%--
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
    <title>Price Third</title>
</head>
<body>
    <div>Welcome to ${priceManager.getName()}</div>
    <%!
        int sum= 0;
    %>
    <%
        PriceManager manager = (PriceManager) request.getAttribute("priceManager");
        for (Price p : manager.getPrices()) {
            sum += p.getPrice();
        }
    %>
    <div>The sum of price is <%=sum%></div>

    <form:form action="priceThird" method="post" modelAttribute="price">
        <form:input path="price" />
<%--        <input type="hidden" name="<csrf:tokenname/>" value="<csrf:tokenvalue/>"/>--%>
        <form:button type="submit" name="submit" value="Submit">Submit</form:button>

    </form:form>
</body>
</html>
