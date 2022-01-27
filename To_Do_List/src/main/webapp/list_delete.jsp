<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete your To do List</title>
 <link rel="stylesheet" href="NewFile.css">
</head>
<body style="background:black;">
<div id="d">
	<form action="Home.jsp">
		
		<h2>Your To-do-List is Successfully Deleted... </h2>
		<%
			HttpSession hs=request.getSession();
		hs.invalidate();
		%>
		<input type="submit" value="click here to go to home page...">
	</form>
	</div>
</body>
</html>