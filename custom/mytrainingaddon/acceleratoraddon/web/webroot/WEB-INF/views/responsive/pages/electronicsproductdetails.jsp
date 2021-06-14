<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h2>Electronics JSP Page</h2>
<c:if test="${not empty ProductData}">
    <table>
        <tr>
            <th><spring:theme code="electronics.product.code"/></th>
            <th><spring:theme code="electronics.product.name"/></th>
            <th><spring:theme code="electronics.product.pk"/></th>
            <th><spring:theme code="electronics.product.gb_size"/></th>
        </tr>
        <c:forEach items="${ProductData}" var="ProductData">
            <tr>
                <td>${ProductData.code}</td>
                <td>${ProductData.name}</td>
                <td>${ProductData.pk}</td>
                <td>${ProductData.gb_size}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>