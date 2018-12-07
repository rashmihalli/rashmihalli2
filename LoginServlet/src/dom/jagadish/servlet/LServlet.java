package dom.jagadish.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dom.jai.dao.UserDAO;

@WebServlet("/LServlet")
public class LServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("userid"); 
		String pwd = request.getParameter("pwd");
		
		try {
			//Class.forName("oracle.jdbc.OracleDriver");
			//Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","orcl11g");
			Connection con =UserDAO.getcon();
			PreparedStatement ps = con.prepareStatement("select userid,password from UsersLis where userid=? and  password=?");
			ps.setString(1, user); 
			ps.setString(2, pwd);		
			ResultSet rs = ps.executeQuery();
	
			if(rs.next()) {
				pw.println("login Done");
				RequestDispatcher rd= request.getRequestDispatcher("/DServlet");
				rd.forward(request, response);
			}else {
				pw.println("Invalid");
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


	