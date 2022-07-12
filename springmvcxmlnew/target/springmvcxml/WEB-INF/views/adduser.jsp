<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h1>${message}</h1>
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.emailId}</td>
				<td><a href="delete?emailId=${user.emailId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<h1>Registration Page</h1>

	<form method="post" action="register">
		<table>
			<tr>
				<td><label for="firstName">First Name</label></td>
				<td><input type="text" id="firstName" name="firstName"
					required="required"></td>
			</tr>
			<tr>
				<td><label for="lastName">Last Name</label></td>
				<td><input type="text" id="lastName" name="lastName"></td>
			</tr>
			<tr>
				<td><label for="pass">Password</label></td>
				<td><input type="password" id="pass" name="pass"></td>
			</tr>
			<tr>
				<td><label for="confirmPass">Confirm Password</label></td>
				<td><input type="password" id="confirmPass" name="confirmPass"></td>
			</tr>
			<tr>
				<td><label for="emailId">Email Id</label></td>
				<td><input type="email" id="emailId" name="emailId"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
	
	<h2>${msg}</h2>
</body>
</html>