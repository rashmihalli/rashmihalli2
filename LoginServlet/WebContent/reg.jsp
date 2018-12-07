<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action='/LoginServlet/RServlet' method = 'post'>
 
    <hr>
 <label><b>UserName:</b></label>
    <input type="text"name="userid" required><br>
    
    <label><b>Password</b></label>
    <input type="password" name="pwd" required><br>
    
   
    
    <label><b>FirstName:</b></label>
    <input type="text"name="fname" required><br>
    
<label><b>LastName:</b></label>
    <input type="text"name="lname" required><br>
     <label><b>E-mail</b></label>
    <input type="Email" name="email" required><br>
    <label><b>MobileNumber</b></label>
    <input type="text" name="mobilenumber" required><br>
   
 

    
    <button type="submit" Value= Register">Register</button>
  
</form>
<a href ="login.html">Return to login page</a>
</body>
</html>