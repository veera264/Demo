<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today your to do list</title>
 <link rel="stylesheet" href="NewFile.css">
</head>
<body style="background-color:black;">
<div id="d">
<form action="Home.jsp">

	<%
		try{
			HttpSession hs=request.getSession();
			List<String> l=(List<String>)hs.getAttribute("list2");
			int i=1;
			 String o1="";
			boolean b=l.isEmpty();
				for(String s:l){
					o1=s;
					out.println("<html><body><br>");
					out.println("<b style='color:orange;'>"+i+". "+o1);
					out.println("</body></html>");
					i++;
				}
			hs.setAttribute("list3",l);
		}catch (Exception e){
			out.println("<html><body><br>");
			out.println("<b style='color:orange;'>");
			out.println("Please Enter your To-Do-list to show u r list");
			out.println("</body></html>");
		}
	%>
	<br><br>
	<input id="i" type="submit" value="Click here to add more list">
	</form><br><br>
	<form action="list_delete.jsp">
		<input id="i" type="submit" value="Click here to create new list...">
	</form>
		</div>
</body>
</html>