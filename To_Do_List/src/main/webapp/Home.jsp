<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home To do List</title>
 <link rel="stylesheet" href="NewFile.css">
</head>
<body style="background-color: black;">
	
	<div id="d">
	<form id="f" action="list_add.jsp">
	<label for="f">Enter Your Today Tasks...</label>
		<input type="text" style="width:250px;" name="list1" placeholder="Enter your task"><br><br>
		<input id="i" type="submit" value="add to your list">
	</form><br>
	<form action="Show_list.jsp">
		<input id="i" type="submit" value="show u r list">
	</form>
	</div>
</body>
</html>