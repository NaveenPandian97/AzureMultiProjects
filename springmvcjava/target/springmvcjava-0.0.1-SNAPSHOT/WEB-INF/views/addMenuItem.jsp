<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href='<c:url value="/resources/css/style.css"/> ' 
	rel="stylesheet">
</head>
<body>
	<div>
		<h1>Add Menu Item</h1>
		<spring:form action="save" method="post"
			modelAttribute="menuItem">
			<table id="menuTab">
				<tr>
					<td><spring:label path="menuItemId">MenuItem Id</spring:label></td>
					<td><spring:input path="menuItemId" /></td>
				</tr>
				<tr>
					<td><spring:label path="menuItemName">MenuItem Name</spring:label></td>
					<td><spring:input path="menuItemName" /></td>
				</tr>
				<tr>
					<td><spring:label path="category">Category</spring:label></td>
					<td><spring:select path="category">
							<spring:option value="Starter">Starter</spring:option>
							<spring:option value="Main Course">Main Course</spring:option>
							<spring:option value="Dessert">Dessert</spring:option>
						</spring:select></td>
				</tr>
				<tr>
					<td><spring:label path="price">Price</spring:label></td>
					<td><spring:input path="price" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear"></td>
					<td><input type="submit" value="Add"></td>
				</tr>

			</table>


		</spring:form>
		<h2>${msg1}</h2>
		<h3 class="error">${errMsg}</h3>
		
		<h2><a href="home">Home</a></h2>
	</div>

</body>
</html>