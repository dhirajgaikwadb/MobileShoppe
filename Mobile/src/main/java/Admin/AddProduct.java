package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import modelclass.Productmodel;
import daoclass.Productdao;;
/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
@MultipartConfig
public class AddProduct extends HttpServlet {
	private Productdao pdao;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
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
		if(Admin.AdminLoginController.value == 1)
		{
			try {
		response.setContentType("text/html");
		String Pname = request.getParameter("product");
		int Price = Integer.parseInt(request.getParameter("price"));
		int Quant = Integer.parseInt(request.getParameter("quant"));
		int Ram = Integer.parseInt(request.getParameter("ram"));
		int Rom = Integer.parseInt(request.getParameter("rom"));
		Part part = request.getPart("pic");
		
		Productmodel pro = new Productmodel(Pname, Price, Quant, Ram, Rom, Pname);
		
			pdao.insertUser(pro);
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			out.println("<p style='color:red;'>please login first</p>");
			rd.include(request, response);
		}
	}

}
