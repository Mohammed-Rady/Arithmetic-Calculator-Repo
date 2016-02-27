<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<title>Online Calculator</title>
		
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@ page isELIgnored="false" %>
	</head>
	
	<body>
		<form:form action="/arithmeticcalculator/calculate" id="form" method="POST" modelAttribute="input" name="form">
			<p style="text-align: center;">
				<span style="font-size:28px;"><span style="font-size:72px;">Online Calculator</span></span></p>
			<p style="text-align: center;">
				<span style="font-size:36px;">Please provide XML format input</span></p>
			<p style="text-align: center;">
				&nbsp;</p>
			<p style="text-align: center;">
				<textarea cols="50" id="input" name="input" rows="20"></textarea></p>
			<p style="text-align: center;">
				<input name="button" type="submit" value="Calculate" /></p>
		</form:form>
		
			<p style="text-align: center;">
				<span style="font-size:36px;">Result: ${result}</span>
			</p>
	</body>
</html>
