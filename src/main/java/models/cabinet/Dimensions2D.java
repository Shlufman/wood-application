package models.cabinet;

public class Dimensions2D {
	public int length;
	public int weight;
	public Dimensions2D(int length, int weight) {
		super();
		this.length = length;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dimensions2D [length=" + length + ", weight=" + weight + "]";
	}
}
