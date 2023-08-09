package Shopping.admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Shopping.admin.dao.ProductServices;
import Shopping.admin.dao.ProductServicesImpl;
import Shopping.admin.model.Product;

/**
 * Servlet implementation class DeleteProductController
 */
@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductServices ps=new ProductServicesImpl();
		String msg=null;
		String action=request.getParameter("action");

		if(action.equals("Delete with Product Id")) {
			int prodId=Integer.parseInt(request.getParameter("prodId"));
			msg=ps.deleteProduct(prodId);
		}
		if(action.equals("Delete with Product Name")) {
			String prodName=request.getParameter("prodName");
			msg=ps.deleteProduct(prodName);
		}

		if(msg.equalsIgnoreCase("Valid")) {
			msg="Product Deleted Successfully";
		}
		HttpSession session0=request.getSession();
		session0.setAttribute("msg", msg);
		response.sendRedirect("DeleteProduct.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
