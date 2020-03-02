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
	<H3>WELCOME TO ORDERMETHOD REGISTER PAGE</H3>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
		<pre>
ordermode:
<form:radiobutton path="orderMode" />SALE
<form:radiobutton path="orderMode" />PURCHASE
order code:
<form:input path="orderCode" />
orderType:
<form:select path="orderType">
<form:option value="">--select</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select>
order accept:
<form:checkbox path="orderAcpt" value="Multi-model" />Multi-model
<form:checkbox path="orderAcpt" value="accept-return" />accept-return
Description:
<form:textarea path="description" />
<input type="submit" value="create">

</pre>
	</form:form>



</body>
</html>