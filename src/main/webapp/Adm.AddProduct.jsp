<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body style="background-color: blanchedalmond">

	<div style="margin: 2%; border: solid; text-align: center; color: blue">
		<%!String msg = " ";%>
		<%
		Object o = session.getAttribute("msg");
		String msg = (String) o;
		%>
		<%
		if (msg!=null){
		%>
		<%=msg%>
		<%
		}
		%>
	</div>

	<div
		style="background-color: dimgrey; margin: 10%; border: solid; padding: 5%;">
		<h3>Add Product</h3>

		<form action="ProductController">

			<table>
				<tr>
					<td>Product Id</td>
					<td><input type="text" name="prodId"></td>
				</tr>
				<tr>
					<td>Product Name</td>
					<td><input type="text" name="prodName"></td>
				</tr>
				<tr>
					<td>Product Price</td>
					<td><input type="text" name="prodPrice"></td>
				</tr>
				<tr>
					<td>Product Quantity</td>
					<td><input type="text" name="prodQty"></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="Add Product"
				name="action"><br>
		</form>

	</div>

	<a href="AdminDashboard.html">
		<button type="submit" style="align-self: center;">Go to Dashboard</button>
	</a>

</body>
</html>