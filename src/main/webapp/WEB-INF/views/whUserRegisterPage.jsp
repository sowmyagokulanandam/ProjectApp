<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<h1 style="color: red;text-align="center"></h1>
<form action="save" method="post">
<pre>
UserCode:
<input type="radio" name="userType" value="vendor">vendor
<input type="radio" name="userType" value="customer">customer
    UserCode:
    <input type="text" name="userCode" />
    UserFor:
    <select name="userFor">
    
<!--         <option>--SELECT--</option> -->
        <option>PURCHASE</option>
        <option>SALE</option>
    </select>
    UserMail:
    <input type="text" name="userMail" />
    ContactNo:
    <input type="text" name="contact" />
    UserIdType:
    <select name="idType">
    <option></option>
        <option>--select</option>
    
        <option>AADHAR></option>
            <option>PAN</option>
            <option>VOTER</option>
            <option>OTHER</option>
           
    </select>
    ifOther:
    <input type="text" name="other" />
    idNumber:
    <input type="text" name="idNo" />
    <input type="submit" value="CREATEUSER" />
</pre>
</form>
${message}