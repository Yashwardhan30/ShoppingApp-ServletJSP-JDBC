<%@page import="java.util.List"%>
<%@page import="Shopping.admin.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product</title>
</head>
<body style="background-color: blanchedalmond">

	<%!List<Product> prodlst = null;
	Product p = null;%>
	<%
	prodlst = (List<Product>) session.getAttribute("prodlst");
	session.invalidate();
	%>

	<div
		style="background-color: dimgrey; align-items center; margin: 10%; border: solid; padding: 5%">
		
		<h3>Products</h3>

		<table>
			<tr style="align-content: left; font-weight: bold;">
				<td style="width: 250px;">Product Id</td>
				<td style="width: 250px;">Product Name</td>
				<td style="width: 250px;">Product Price</td>
				<td style="width: 250px;">Product Quantity</td>
			</tr>
			<tr>
			
			</tr>
			<%
			for (Product p : prodlst) {
			%>
			<tr>
				<td><%=p.getProdId()%></td>
				<td><%=p.getProdName()%></td>
				<td><%=p.getProdPrice()%></td>
				<td><%=p.getProdQty()%></td>
			</tr>
			<%
			}
			%>

		</table>

	</div>

	<a href="AdminDashboard.html">
		<button type="submit" style="align-self: center;">Go to
			Dashboard</button>
	</a>

</body>
</html>