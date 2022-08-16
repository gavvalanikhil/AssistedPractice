package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Nikhil@2001");
			String id = request.getParameter("id");
			//Write sql command
				String str="select * from product where pid="+id;
				
				//to execute query create object of Statement
				Statement  ps=con.createStatement();
				//get ResultSet
				ResultSet ans =ps.executeQuery(str);
				//next method checks for nextrecord
				
				
				//To read values from ResultSet
				if(ans.next()) {
					out.println("<table border=3>");
					out.println("<tr><th>ID</th><th>Name</th><th>Category</th><th>Price</th></tr>");
					out.println("<tr>");
					out.print("<td>"+ans.getInt("ID")+"</td>");
					out.print("<td>"+ans.getString("name")+"</td>");
					out.print("<td>"+ans.getString("category")+"</td>");
					out.print("<td>"+ans.getInt("price")+"</td>");
					out.println("</tr>");
					out.println("</table>");
				}
				else {
				out.println("No records found!");
				}
				con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
