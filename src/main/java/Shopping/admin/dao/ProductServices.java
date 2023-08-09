package Shopping.admin.dao;
import java.util.List;

import Shopping.admin.model.Product;

public interface ProductServices {

	public String addProduct(Product p);
	public Product searchProduct(int prodId);
	public Product searchProduct(String prodName);
	public String deleteProduct(int prodId);
	public String deleteProduct(String prodName);
	public List<Product> DisplayAllProducts();
	public String UpdateProductQty(int prodId, double prodQty);
	public String UpdateProductPrice(int prodId, double prodPrice);
	
}
