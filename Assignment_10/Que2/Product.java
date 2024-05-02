package p1;

public class Product implements Comparable<Product>{
	int id;
	String name;
	String category;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
	
		return category.compareTo(o.category);
	}
	
}
