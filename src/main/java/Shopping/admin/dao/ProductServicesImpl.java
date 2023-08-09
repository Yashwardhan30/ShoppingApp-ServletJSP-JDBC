package Shopping.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Shopping.DataSource.DBConnection;
import Shopping.admin.model.Product;

public class ProductServicesImpl implements ProductServices {

	Connection con=DBConnection.getConnection();

	@Override
	public String addProduct(Product p) {
		int i;
		String msg=null;

		try {
			PreparedStatement pst=con.prepareStatement("insert into products values(?,?,?,?)");
			pst.setInt(1, p.getProdId());
			pst.setString(2, p.getProdName());
			pst.setDouble(3, p.getProdPrice());
			pst.setDouble(4, p.getProdQty());
			i=pst.executeUpdate();

			if(i>0) {
				msg="Valid";
			}else {
				msg="Invalid";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
			e.printStackTrace();
		}

		return msg;
	}

	@Override
	public Product searchProduct(int prodId) {
		Product p=null;

		try {
			PreparedStatement pst=con.prepareStatement("select * from products where prod_id=?");
			pst.setInt(1, prodId);
			ResultSet rs=pst.executeQuery();

			if(rs.next()) {
				p=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public Product searchProduct(String prodName) {
		Product p=null;

		try {
			PreparedStatement pst=con.prepareStatement("select * from products where prod_name=?");
			pst.setString(1, prodName);
			ResultSet rs=pst.executeQuery();

			if(rs.next()) {
				p=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Product> DisplayAllProducts() {
		List<Product> prodlst=new LinkedList<Product>();

		try {
			PreparedStatement pst=con.prepareStatement("select * from products");
			ResultSet rs=pst.executeQuery();

			while(rs.next()) {
				Product p=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
				prodlst.add(p);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prodlst;
	}

	@Override
	public String deleteProduct(int prodId) {
		String msg=null;
		int i;

		try {
			PreparedStatement pst=con.prepareStatement("delete from products where prod_id=?");
			pst.setInt(1, prodId);
			i=pst.executeUpdate();

			if(i>0) {
				msg="Valid";
			}else {
				msg="Invalid";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String deleteProduct(String prodName) {
		String msg=null;
		int i;

		try {
			PreparedStatement pst=con.prepareStatement("delete from products where prod_name=?");
			pst.setString(1, prodName);
			i=pst.executeUpdate();

			if(i>0) {
				msg="Valid";
			}else {
				msg="Invalid";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String UpdateProductQty(int prodId, double prodQty) {
		String msg=null;
		int i;

		try {
			PreparedStatement pst=con.prepareStatement("update products set prod_qty=? where prod_id=?");
			pst.setDouble(1, prodQty);
			pst.setInt(2, prodId);
			i=pst.executeUpdate();

			if(i>0) {
				msg="Valid";
			}else {
				msg="Invalid";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String UpdateProductPrice(int prodId, double prodPrice) {
		String msg=null;
		int i;

		try {
			PreparedStatement pst=con.prepareStatement("update products set prod_price=? where prod_id=?");
			pst.setDouble(1, prodPrice);
			pst.setInt(2, prodId);
			i=pst.executeUpdate();

			if(i>0) {
				msg="Valid";
			}else {
				msg="Invalid";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

}
