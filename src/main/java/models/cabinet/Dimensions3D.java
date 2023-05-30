package models.cabinet;

public class Dimensions3D {
	public int length;
	public int height;
	public int weight;
	public Dimensions3D(int length, int height, int weight) {
		super();
		this.length = length;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dimensions3D [length=" + length + ", height=" + height + ", weight=" + weight + "]";
	}
}
