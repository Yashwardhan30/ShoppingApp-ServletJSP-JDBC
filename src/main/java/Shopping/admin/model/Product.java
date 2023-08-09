package Shopping.admin.model;

public class Product {
	
	private int prodId;
	private String prodName;
	private double prodPrice;
	private double prodQty;
	
	public Product(int prodId, String prodName, double prodPrice, double prodQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public double getProdQty() {
		return prodQty;
	}
	public void setProdQty(double prodQty) {
		this.prodQty = prodQty;
	}
		
}
