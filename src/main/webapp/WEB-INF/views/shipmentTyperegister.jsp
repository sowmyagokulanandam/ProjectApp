<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h3>welcome to shipmentTypeRegisterPage</h3>
<form:form action="save" method="POST" modelAttribute="shipmentType">
	<pre>
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
	<input type="submit" value="create">
					
	</pre>


</form:form>
${message}

<%-- 	<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <h3>WELCOME TO SHIPMENT TYPE REGISTRATION</h3> -->
<!-- <form action="save" method="post"> -->
<!-- <pre> -->
<!-- shipmentMode:<select name="shipMode"> -->
<!-- <option>---select---</option> -->
<!-- <option>air</option> -->
<!-- <option>train</option> -->
<!-- <option>ship</option> -->
<!-- <option>truck</option> -->

<!-- </select> -->
<!-- shipmentCode: -->
<!-- <input type="text" name="shipCode" /> -->
<!-- EnableShipment: -->
<!-- <select name="enbShip"> -->
<!-- <option>select</option> -->
<!-- <option>yes</option> -->

<!-- <option>no</option> -->
<!-- </select> -->
<!-- shipmentGrade: -->
<!-- <input type="radio" name="shipGrade" value="A">A -->
<!-- <input type="radio" name="shipGrade" value="B">B -->
<!-- <input type="radio" name="shipGrade" value="C">C -->
<!-- description: -->
<!-- <textarea name="shipdesc"></textarea> -->
<!-- <input type="submit" value="Register"> -->

<!-- </pre> -->
<!-- </form> -->
<%-- ${message} --%>

