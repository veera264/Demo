<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Add</title>
</head>
 <link rel="stylesheet" href="NewFile.css">
<body style="background-color:black;">
	<div id="d">
	<%! String s; %>
	<form action="Home.jsp" >
	<% 
		s=request.getParameter("list1");
	if(s.length()>=4){
		List<String> list=new ArrayList<>();
		list.add(s);
		
		
		HttpSession hs= request.getSession();
		hs.setAttribute("list2",list);
		//response.sendRedirect("Home.jsp");
		try{
			List<String>li=(List<String>)hs.getAttribute("list3");
			list.addAll(li);
		}catch(Exception e){
		}
		}
	else{
		out.println("Please Enter your Task More Than 5 Characters...");
	}
	%>
	<h2 id="h"><%=s %></h2>
		<input id="i" type="submit" value="Please Conform Your List....">
	</form>	
	</div>
</body>
</html>