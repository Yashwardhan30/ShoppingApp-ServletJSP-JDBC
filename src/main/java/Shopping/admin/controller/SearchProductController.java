package Shopping.admin.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
 * Servlet implementation class SearchProductController
 */
@WebServlet("/SearchProductController")
public class SearchProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProductController() {
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
		Product p=null;
		String action=request.getParameter("action");
		
		if(action.equals("Search with Product Id")) {
			int prodId=Integer.parseInt(request.getParameter("prodId"));
			p=ps.searchProduct(prodId);
		}
		if(action.equals("Search with Product Name")) {
			String prodName=request.getParameter("prodName");
			p=ps.searchProduct(prodName);
		}
		
		List<Product> prodlst=new LinkedList<Product>();
		prodlst.add(p);
		
		HttpSession session=request.getSession();
		session.setAttribute("prodlst", prodlst);
		response.sendRedirect("DisplayProduct.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
