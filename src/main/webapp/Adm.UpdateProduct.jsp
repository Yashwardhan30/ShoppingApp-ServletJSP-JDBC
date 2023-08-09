<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body style="background-color: blanchedalmond">

	<div style="margin: 2%; border: solid; text-align: center; color: blue">
		<%!String msg = " ";%>
		<%
		Object o = session.getAttribute("msg");
		String msg = (String) o;
		%>
		<%
		if (msg != null) {
		%>
		<%=msg%>
		<%
		}
		%>
	</div>

	<div
		style="background-color: dimgrey; margin: 10%; border: solid; padding: 5%">

		<h3>Update Product</h3>

		<form action="UpdateProductController">
			<h5>Update Product Quantity</h5>
			<table>
				<tr>
					<td>Product Id</td>
					<td><input type="text" name="prodId1"></td>
				</tr>
				<tr>
					<td>New Product Quantity</td>
					<td><input type="text" name="prodQty"></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="Update Quantity"
				name="action"><br>
			-----------------------------------------------------------------------------------------------------
			<h5>Update Product Price</h5>
			<table>
				<tr>
					<td>Product Id</td>
					<td><input type="text" name="prodId2"></td>
				</tr>
				<tr>
					<td>New Product Price</td>
					<td><input type="text" name="prodPrice"></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="Update Price"
				name="action"><br>
		</form>

	</div>

	<a href="AdminDashboard.html">
		<button type="submit" style="align-self: center;">Go to
			Dashboard</button>
	</a>

</body>
</html>