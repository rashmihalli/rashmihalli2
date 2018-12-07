package dom.jagadish.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dom.jai.dao.UserDAO;


@WebServlet("/RServlet")
public class RServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("userid");
		String pwd =request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String  mobile=request.getParameter("mobilenumber");
		try{
		Connection con= UserDAO.getcon();
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
		PreparedStatement ps = con.prepareStatement("insert into UsersLis values ('"+user+"','"+pwd+"','"+fname+"','"+lname+"','"+email+"','"+mobile+"')");
		ResultSet rs = ps.executeQuery();
		//int i =st.executeUpdate("insert into UsersLis values ('"+user+"','"+pwd+"','"+fname+"','"+lname+"','"+email+"','"+mobile+"')");
		//pw.println("/LServlet");
			pw.println("Register Done");
				
	
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
