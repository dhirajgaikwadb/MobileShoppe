package Admin;

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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	static int value=0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String mail = request.getParameter("mail");
		String Password = request.getParameter("pass");
		String Mail1,Pass1;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
			Statement stmt=con.createStatement();
		    String sqlquery="select mail,password from mobile.login where mail='"+mail+"';";
		    ResultSet rs = stmt.executeQuery(sqlquery);
		    while(rs.next())
			{
				Mail1 = rs.getString("mail");
				Pass1 = rs.getString("password");
				System.out.println(Mail1);
				System.out.println(Pass1);
				if(Mail1.contains(mail))
				{
					if(Pass1.contains(Password))
					{
						value=1;
						out.println("<html><head>");
			    		out.println("<script>alert('Login Successful'</script>");
			    		out.println("</head></html>");
			    		RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
			        	rd.forward(request, response);
					}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
						out.println("<p style='color:red;'>Wrong Password</p>");
						rd.include(request, response);
					}
		}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
					out.println("<p style='color:red;'>Wrong username</p>");
					rd.include(request, response);
				}
				stmt.close();
				con.close();
				rs.close();
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			out.println("<html><head><script>alert('Please enter the Valid mail and Password')</script></head></html>");
			rd.include(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			out.println("<h1 style='color:red;'>Wrong username</h1>");
			rd.include(request, response);
		}
			finally {
				out.close();
			}
				
		
	}

}
