<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped table-hover">
<thead>
<tr>
<td>srno</td>
<td>Product Name</td>
<td>Product Price</td>
<td>Remove</td>
</tr>
</thead>

<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=null;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
    Statement stmt=con.createStatement();
    HashMap<String,Integer> list=(HashMap<String,Integer>)request.getAttribute("hash");
    int i=1;
    double Grandtotal=0;
    for(Map.Entry m : list.entrySet())
    {  
			String productname= m.getKey().toString();
		
			double totalprice=0;
			String query="select ProductName,ProductPrice from addproduct where ProductName='"+productname+"'"; 
			 ResultSet rs=stmt.executeQuery(query);
			 while(rs.next())
		       {
		    	   
		    	   int price=rs.getInt("Productprice");
		    	   String pname=rs.getString("ProductName");
%>
<tbody>
<tr>
		   		   <td><%=i %></td>
		   		   <td><%=productname %></td>
		           <td><%=price%></td>
				    
		           <td><form action="finalcart" method="post"><button type="submit" name=<%=pname %> value=<%=pname %>>Remove</button></form></td>
					</tr>
		   
</tbody>
</table>
<br>
		   <br>
		    <form action="buy" method="post"><button type="submit" name="buy" style="margin-left:17%">Buy <%=price %> </button></form>
		           <%
		       }
    }
    
                    stmt.close();
            
                    con.close();
            }
            catch(Exception e)
            {
                    e.printStackTrace();
            }
            
                
    %>
</body>
</html>