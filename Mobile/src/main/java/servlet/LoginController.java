package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;

import daoclass.DaoClass;
import modelclass.registermodel;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	static int value = 0;
	static String Emails;
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		HttpSession Session = request.getSession();
		
			response.setContentType("text/html");
			String mail = request.getParameter("mail");
			String Password = request.getParameter("pass");
			String mail1 = null,Pass1 = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=null;
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
				Statement stmt=con.createStatement();
			    String sqlquery="select Email,Password from Register where Email='"+mail+"';";
			    ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next())
			{
				mail1 = rs.getString("Email");
				Pass1 = rs.getString("Password");
				System.out.println(mail1);
				System.out.println(Pass1);
				if(mail1.contains(mail))
				{
					if(Pass1.contains(Password))
					{
						value = 1;
						Emails = request.getParameter("mail");
						out.println("<html><head>");
			    		out.println("<script>alert('Login Successful'</script>");
			    		out.println("</head></html>");
			    		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			        	rd.forward(request, response);
			        	
			        	Session.setAttribute("mail1", mail1);
			        	
			        	Cookie ck = new Cookie("Mail",mail1);
			        	Cookie ck1 = new Cookie("Password",Pass1);
			        	ck.setMaxAge(60*60*12);
			        	ck1.setMaxAge(60*60*12);
			        	response.addCookie(ck);
			        	response.addCookie(ck1);
			        	break;
			        	
					}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
						out.println("<p style='color:red;'>Wrong Password</p>");
						rd.include(request, response);
					}
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					out.println("<p style='color:red;'>Wrong username</p>");
					rd.include(request, response);
				}
			}
			stmt.close();
			con.close();
			rs.close();
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			out.println("<html><head><script>alert('Please enter the Valid mail and Password')</script></head></html>");
			rd.include(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			out.println("<h1 style='color:red;'>Wrong username</h1>");
			rd.include(request, response);
		}
			finally {
				out.close();
			}
			
	}

}
