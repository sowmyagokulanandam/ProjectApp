<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h3>welcome to shipmentTypeEditPage</h3>
<form:form action="update" method="POST" modelAttribute="shipmentType">

	<pre>
	ShipmentId:
	<form:input path="shipId" readonly="true"></form:input>
	shipmentMode:
	<form:select path="shipMode">
	<form:option value="air">Air</form:option>
		<form:option value="Train">train</form:option>
	
		<form:option value="Truck">Truck</form:option>
	
		<form:option value="ship">ship</form:option>
	
	</form:select>
	ShipmentCode:
	<form:input path="shipCode" />
	EnableShipment:
	<form:select path="enbShip">
	<form:option value="">SELECT</form:option>
	<form:option value="yes">YES</form:option>
	<form:option value="no">NO</form:option>
	</form:select>
	shipmentGrade:
	<form:radiobutton path="shipGrade" value="A" />A
	<form:radiobutton path="shipGrade" value="B" />B
	<form:radiobutton path="shipGrade" value="C" />C
	Description:
	<form:textarea path="shipdesc" />
	<input type="submit" value="update">
					
	</pre>

<%-- 	<a href="edit?sid=${ob.shipId}">update</a> --%>

</form:form>
${message}



