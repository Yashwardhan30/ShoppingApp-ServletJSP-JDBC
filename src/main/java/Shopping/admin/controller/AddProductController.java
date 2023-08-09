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
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
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
		
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		String prodName=request.getParameter("prodName");
		double prodPrice=Double.parseDouble(request.getParameter("prodPrice"));
		double prodQty=Double.parseDouble(request.getParameter("prodQty"));
		
		Product p=new Product(prodId, prodName, prodPrice, prodQty);
		
		msg=ps.addProduct(p);
		
		if(msg.equalsIgnoreCase("Valid")) {
			msg="Product Added Successfully";
		}
		HttpSession session0=request.getSession();
		session0.setAttribute("msg", msg);
		response.sendRedirect("AddProduct.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
