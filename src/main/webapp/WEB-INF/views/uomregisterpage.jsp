<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<H3>WELCOME TO UOM REGISTRATION PAGE</H3>
	<form:form action="save" method="POST" modelAttribute="uom">
		<pre>
    Uom Type
    <form:select path="uomType">
        <form:option value="--select--"></form:option>
        <form:option value="packing"></form:option>
        <form:option value="Nopacking"></form:option>
        </form:select>
        uomModel:
        <form:input path="uomModel" />
        Description:
        <form:textarea path="description" />
        <input type="submit" value="create Uom" />
    
    </pre>
	</form:form> 	
	${message} 
	


</body>
</html>