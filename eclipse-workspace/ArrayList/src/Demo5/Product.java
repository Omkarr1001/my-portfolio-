package Demo5;

public class Product {
	int id;
	String name;
	double price;
	String Category;
	
	
	public Product(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.Category = category;
	}
	public void applyDiscount(double disPercentage)
	{
		double dis=1-(disPercentage/100);
		this.price *=dis;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", Category=" + Category + "]";
	}
	

}
