package model.material;

import model.codes.Facing;

public class Coat {
	public int id;
	public Facing name;
	public String code;
	public String color; 
	public String producer;
	
	public Coat(int id, Facing name,String color, String code, String producer) {
		super();
		this.id = id;
		this.color=color;
		this.name = name;
		this.code = code;
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Coat [id=" + id + ", name=" + name + ", code=" + code + ", color=" + color + ", producer=" + producer
				+ "]";
	}


	
}
