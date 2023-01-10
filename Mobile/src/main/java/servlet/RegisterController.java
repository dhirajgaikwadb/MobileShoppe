package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoclass.DaoClass;
import modelclass.registermodel;
/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private DaoClass dao;
	
	public void init() {
		dao = new DaoClass();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Fname = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String email = request.getParameter("mail");
		String phone = request.getParameter("Phone");
		String Add = request.getParameter("add");
		String pass = request.getParameter("password");
		String cpass = request.getParameter("cpassword");
		
		if(!pass.contains(cpass))
		{
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			out.println("<html><head><script>alert('Please enter the same password in pasword ans confirm password')</script></head></html>");
			rd.include(request, response);
		}
		else {
			
		registermodel newuser = new registermodel(Fname,Lname,email,phone,Add,pass);
		
			dao.insertUser(newuser);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
			
		}
	}
}


