<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<%
		String user = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "orcl11g");
		PreparedStatement preparedStatement = con
				.prepareStatement("select userid from student where userid=? and  password=?");
		preparedStatement.setString(1, user);
		preparedStatement.setString(2, pwd);
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			out.println("Welcome");
		} else {
			out.println("Invalid ");
		}
	%>
	<hr/>
	<a href=login.html>Login</a>
</body>
</html>