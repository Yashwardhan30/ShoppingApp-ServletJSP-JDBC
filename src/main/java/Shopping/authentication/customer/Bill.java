package Shopping.authentication.customer;

public class Bill {
	private double total;
	private double cgst;
	private double sgst;
	private double finalTotal;

	public Bill(double total, double cgst, double sgst, double finalTotal) {
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalTotal = finalTotal;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}

}
