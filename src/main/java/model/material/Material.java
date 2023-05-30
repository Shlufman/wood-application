package model.material;

public class Material {

	public int id;
	public String name;
	public Integer depth;
	public Coat face;
	public Coat back;
	public double price;
	public Material(int id, String name, Coat face, Coat back, Integer depth, double price) {
		super();
		this.id = id;
		this.name = name;
		this.depth = depth;
		this.face = face;
		this.back = back;
		this.price = price;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", depth=" + depth + ", \nface=" + face + ", \nback=" + back
				+ ", price=" + price + "]";
	}
}
