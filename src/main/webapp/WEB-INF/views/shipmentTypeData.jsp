<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<H3>WELCOME TO SHIPMENTTYPE DATA</H3>
<c:choose>
	<c:when test="${!empty list }">
		<table border="1">
			<tr>

				<th>ID</th>
				<th>MODE</th>
				<th>CODE</th>
				<th>ENABLE</th>
				<th>GRADE</th>
				<th>NOTE</th>
				<th>OPERATION</th>
				
			</tr>
			<c:forEach items="${list}" var="ob">
				<tr>


					<td>${ob.shipId }</td>
					<td>${ob.shipMode }</td>
					<td>${ob.shipCode}</td>
					<td>${ob.enbShip }</td>
					<td>${ob.shipGrade}</td>
					<td>${ob.shipdesc}</td>
					<td><a href="edit?sid=${ob.shipId}">EDIT</a></td>&nbsp;&nbsp;&nbsp;&nbsp;
					<td><a href="delete?sid=${ob.shipId}">DELETE</a></td>&nbsp;&nbsp;&nbsp;&nbsp;
					<td><a href="view?sid=${ob.shipId}">VIEW</a></td>&nbsp;&nbsp;&nbsp;&nbsp;
					


				</tr>
				



			</c:forEach>
<a href="excel">ExcelExport</a>
<a href="charts">piechart</a>



		</table>
		${message} 
		


	</c:when>
	<c:otherwise>
		<H4>NO DATA FOUND</H4>
	</c:otherwise>




</c:choose>
