package question04;

public class Product {

	private String name;
	private double costPrice;
	private double sellingPrice;
	private double profitMargin;
	private double bussinessExpenses;

	public void calcProfitMargin() {
		this.profitMargin = 100 * (this.sellingPrice - (this.costPrice + this.bussinessExpenses)) / this.sellingPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getProfitMargin() {
		return this.profitMargin;
	}
 	public Product(String name, double costPrice, double sellingPrice, double bussinessExpenses) {
		this.name = name;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.bussinessExpenses = bussinessExpenses;
	}

}
