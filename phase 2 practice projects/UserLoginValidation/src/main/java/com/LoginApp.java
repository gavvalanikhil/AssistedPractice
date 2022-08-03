package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginApp
 */
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("txtUname");
		String pword = request.getParameter("txtPassword");
		if (uname.equalsIgnoreCase("uvk@gmail.com") && pword.equals("Uvk@123"))
		{
		pw.println("You are Welcome");
		} else
		pw.println("Invalid Username or Password");
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String uname = request.getParameter("txtUname");
		String pword = request.getParameter("txtPassword");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		if (uname.equalsIgnoreCase("nikhilgavvala6050@gmail.com") && pword.equals("nikhil6050"))
		{
		HttpSession session = request.getSession(true);
		// create a new object and store its reference in session
		// object
		session.setAttribute("username", uname);
		rd = request.getRequestDispatcher("Welcome");
		rd.forward(request, response);
		} else {
		out.println("Invalid UserID or Password");
		rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
		}
	}

}
