<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Transaction Page</title>
</head>
<body>
	<h1 align="center">Transaction Page</h1>
	<div align="center">
	
		<h4>
		Logged in as <c:out value="${param.prof}"/>
		<c:out value="${param.username}"/>
		</h4><br />
		
		
		<form action="/ControllerServlet" method="check">
			<u>Patient Details</u> <br />
			First Name: <input type="text" name="pfirstname" /> <br />
			Last Name: <input type="text" name="plastname" /> <br />
			<u>Vital Signs</u><br />
			Timestamp: 
			Blood Pressure: <input type="text" name="pfirstname" /> <br />
			Heart Rate: <input type="text" name="plastname" /> <br />
			Respiratory Rate: <input type="text" name="pfirstname" /> <br />
			Temperature: <input type="text" name="plastname" /> <br />
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>