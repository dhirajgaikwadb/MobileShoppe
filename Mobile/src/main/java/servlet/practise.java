package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class practise
 */
@WebServlet("/practise")
public class practise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public practise() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out = response.getWriter();
		
		HttpSession Session = request.getSession();
		
			response.setContentType("text/html");
			HashMap<String,Integer> list=(HashMap<String,Integer>)request.getAttribute("hash");
			Map link1 =(Map)request.getAttribute("hash");
			list=(HashMap<String, Integer>) request.getAttribute("hash");
			
			for(Map.Entry<String, Integer> m:list.entrySet())
			{
				String productname= m.getKey().toString();
				int product_quantity=Integer.parseInt(m.getValue().toString());
				out.println(productname);
				out.println(product_quantity);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
