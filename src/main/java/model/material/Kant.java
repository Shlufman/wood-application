package model.material;

public class Kant {
	public int id;
	public String code;
	public String producer;
	public String name;
	public double price;
	
	public Kant(int id, String code, String producer, String name, double price) {
		super();
		this.id = id;
		this.code = code;
		this.producer = producer;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Kant [id=" + id + ", code=" + code + ", producer=" + producer + ", name=" + name + ", price=" + price
				+ "]";
	}	
}
