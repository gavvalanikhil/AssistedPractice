package com.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.getProducts;

/**
 * Servlet implementation class ProdDetailsServlet
 */
@WebServlet("/ProdDetailsServlet")
public class ProdDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<getProducts> details = new ArrayList<>();

    public ProdDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String prodID = request.getParameter("productID");
		String prodName = request.getParameter("productName");
		String model = request.getParameter("model");
		// initialsing the object of class products using the constructor
		getProducts obj = new getProducts(prodID, prodName, model );
		// adding the object "obj" to the list "details"
		details.add(obj);
		// Product_details is used in for-each loop in the .jsp file
		request.setAttribute("Product_Details", details);
		// forwarding the request to the .jsp file
		RequestDispatcher rd = request.getRequestDispatcher("/listProdDetails.jsp");
		rd.forward(request, response);
		}

	}


