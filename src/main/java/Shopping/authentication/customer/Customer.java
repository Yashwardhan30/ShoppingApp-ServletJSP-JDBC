package Shopping.authentication.customer;

import Shopping.admin.model.Product;

public class Customer {
	private int custId;
	private String custName;
	private String mobNo;
	private String userName;
	private String password;
	private Address addr;
	private Product[] parr;
	private Bill bill;
	
	public Customer(int custId, String custName, String mobNo, String userName, String password, Address addr,
			Product[] parr, Bill bill) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.userName = userName;
		this.password = password;
		this.addr = addr;
		this.parr = parr;
		this.bill = bill;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getParr() {
		return parr;
	}
	public void setParr(Product[] parr) {
		this.parr = parr;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}
