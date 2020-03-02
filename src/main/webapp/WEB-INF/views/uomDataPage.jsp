<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<H3>WELCOME TO UOMDATAPAGE</H3>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
<th>ID</th>
<th>TYPE</th>
<th>MODEL</th>
<th>DESCRIPTION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.uomId}</td>
<td>${ob.uomType}</td>

<td>${ob.uomModel}</td>
<td>${ob.description}</td>
<td><a href="delete?uid=${ob.uomId}">DELETE</a>
</tr>
</c:forEach>


</table>
</c:when>
<c:otherwise>
<H4>DATA NOT FOUND</H4>
</c:otherwise>

</c:choose>