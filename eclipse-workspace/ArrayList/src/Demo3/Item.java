package Demo3;


public class Item {
	int id;
	String name;
	float costprice;
	float sellingprice;
	
	public Item(int id, String name, float costprice, float sellingprice) {
		super();
		this.id = id;
		this.name = name;
		this.costprice = costprice;
		this.sellingprice = sellingprice;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", costprice=" + costprice + ", sellingprice=" + sellingprice
				+ "]";
	}
}
