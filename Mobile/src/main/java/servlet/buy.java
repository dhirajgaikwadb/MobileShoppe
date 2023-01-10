package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class buy
 */
@WebServlet("/buy")
public class buy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buy() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(request.getParameter("Samsung Galaxy M33 5G")!=null)
		{
			String remove="Samsung Galaxy M33 5G".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("Oppo A74 Fantastic Purple")!=null)
		{
			String remove="Oppo A74 Fantastic Purple".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("Redmi 10A Sport")!=null)
		{
			String remove="Redmi 10A Sport".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("Samsung Galaxy M32 Prime")!=null)
		{
			String remove="Samsung Galaxy M32 Prime".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("IQOO 9 SE 5G")!=null)
		{
			String remove="IQOO 9 SE 5G".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("OnePlus Nord 2T 5G")!=null)
		{
			String remove="OnePlus Nord 2T 5G".toString().toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("IQOO Z6")!=null)
		{
			String remove="IQOO Z6".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("IQOO Z644w")!=null)
		{
			String remove="IQOO Z644w".toString();
			cart.list.remove(remove);
		}
		if(request.getParameter("Realme narzo 50A")!=null)
		{
			String remove="Realme narzo 50A".toString();
			cart.list.remove(remove);
		}
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		out.println("<html><head><script>alert('Thank you for buying')</script></head></html>");
    	rd.forward(request, response);
	}

}
