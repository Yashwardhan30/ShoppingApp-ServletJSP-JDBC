<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Product</title>
</head>
<body style="background-color: blanchedalmond">

	<div
		style="background-color: dimgrey; margin: 10%; border: solid; padding: 5%">

		<h3>Search Product</h3>

		<form action="SearchProductController">

			<table>
				<tr>
					<td><input type="text" name="prodId"></td>
					<td><input type="submit" value="Search with Product Id"
						name="action"></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<td><input type="text" name="prodName"></td>
					<td><input type="submit" value="Search with Product Name"
						name="action"></td>
				</tr>
			</table>

		</form>

	</div>

	<a href="AdminDashboard.html">
		<button type="submit" style="align-self: center;">Go to
			Dashboard</button>
	</a>

</body>
</html>