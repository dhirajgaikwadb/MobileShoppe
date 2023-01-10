package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.LoginController;
/**
 * Servlet implementation class cart
 */
@WebServlet("/cart")
public class cart extends HttpServlet {
	static HashMap<String,Integer> list=new HashMap<String,Integer>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cart() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(LoginController.value!=0)
		{
		
		String Productname1=request.getParameter("Samsung_Galaxy_M33_5G");
		String Productname2=request.getParameter("OppoA74FantasticPurple");
		String Productname3=request.getParameter("Redmi10ASport");
		String Productname4=request.getParameter("SamsungGalaxyM32Prime");
		String Productname5=request.getParameter("IQOO9SE5G");
		String Productname6=request.getParameter("OnePlusNord2T5G");
		String Productname7=request.getParameter("IQOOZ6");
		String Productname8=request.getParameter("IQOOZ644w");
		String Productname9=request.getParameter("Realmenarzo50A");
		
		if(!(Productname1=="") && !(Productname1==null))
		{
			list.put("Samsung Galaxy M33 5G", 1);
		}
		if(!(Productname2=="") && !(Productname2==null))
		{
			list.put("Oppo A74 Fantastic Purple", 2);
		}
		if(!(Productname3=="") && !(Productname3==null))
		{
			list.put("Redmi 10A Sport", 3);
		}
		if(!(Productname4=="") && !(Productname4==null))
		{
			list.put("Samsung Galaxy M32 Prime", 4);
		}
		if(!(Productname5=="") && !(Productname5==null))
		{
			list.put("IQOO 9 SE 5G", 5);
		}
		if(!(Productname6=="") && !(Productname6==null))
		{
			list.put("OnePlus Nord 2T 5G", 6);
		}
		if(!(Productname7=="") && !(Productname7==null))
		{
			list.put("IQOO Z6", 7);
		}
		if(!(Productname8=="") && !(Productname8==null))
		{
			list.put("IQOO Z644w", 8);
		}
		if(!(Productname9=="") && !(Productname9==null))
		{
			list.put("Realme narzo 50A", 9);
		}
		request.setAttribute("hash",list);
		Map link1 =(Map)request.getAttribute("hash");
		list=(HashMap<String, Integer>) request.getAttribute("hash");
		
		for(Map.Entry<String, Integer> m:list.entrySet())
		{
			String productname= m.getKey().toString();
			int product_quantity=Integer.parseInt(m.getValue().toString());
			out.println(productname);
			out.println(product_quantity);
		}
		RequestDispatcher rd=request.getRequestDispatcher("cart.jsp");
		rd.forward(request, response);
		
	}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			out.println("<html><head><script>alert('Please Login First')</script></head></html>");
			rd.include(request, response);
		}
	}
	

}
