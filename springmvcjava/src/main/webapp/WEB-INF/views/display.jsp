<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>Menu Items</h1>

	<table id="menuTab">
		<tr>
			<th>Menu Item Id</th>
			<th>Menu Item Name</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach var="menuItem" items="${menuItemList}">
			<tr>
				<td>${menuItem.menuItemId}</td>
				<td>${menuItem.menuItemName}</td>
				<td>${menuItem.category}</td>
				<td>${menuItem.price}</td>
			</tr>
		</c:forEach>

	</table>
	<h2><a href="add">Add Menu Item</a></h2>
</div>
</body>
</html>