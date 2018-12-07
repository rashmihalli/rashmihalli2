<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%@ page import = 'java.sql.*'  %>
<%@ page import ='javax.sql.*'  %>

<%
String user=request.getParameter("userid");
String pwd =request.getParameter("pwd");
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
		Statement st = con.createStatement();
ResultSet rs;

int i =st.executeUpdate("insert into student values ('"+user+"','"+pwd+"','"+fname+"','"+lname+"','"+email+"')");
out.println("Success");
%>

<a href ='login.html'>Login</a>
</body>
</html>