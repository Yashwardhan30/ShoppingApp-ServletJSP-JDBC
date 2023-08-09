package Shopping.admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Shopping.admin.dao.ProductServicesImpl;

/**
 * Servlet implementation class UpdateProductController
 */
@WebServlet("/UpdateProductController")
public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		ProductServicesImpl ps=new ProductServicesImpl();
		String msg=null;
		String action=request.getParameter("action");

		if(action.equals("Update Price")) {
			int prodId=Integer.parseInt(request.getParameter("prodId2"));
			double prodPrice=Double.parseDouble(request.getParameter("prodPrice"));
			
			msg=ps.UpdateProductPrice(prodId, prodPrice);
			if(msg.equalsIgnoreCase("Valid")) {
				msg="Product Price Updated Successfully";
			}
		}
		if(action.equals("Update Quantity")) {
			int prodId=Integer.parseInt(request.getParameter("prodId1"));
			double prodQty=Double.parseDouble(request.getParameter("prodQty"));
			
			msg=ps.UpdateProductQty(prodId, prodQty);
			if(msg.equalsIgnoreCase("Valid")) {
				msg="Product Quantity Updated Successfully";
			}
		}
		System.out.println(msg);
		HttpSession session0=request.getSession();
		session0.setAttribute("msg", msg);
		response.sendRedirect("UpdateProduct.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
