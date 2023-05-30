package models.cabinet.detail;

import java.util.Arrays;

import model.material.Kant;
import model.material.Material;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;

public class Detail {
	public Cabinet cabinet;
	public Material material;
	public Kant[] kants;
	public Dimensions2D dimensions;

	public Detail(Material material,Dimensions2D dimensions, Kant[] kants, Cabinet cabinet) {
		super();
		this.material = material;
		this.kants = kants;
		this.dimensions = dimensions;
		this.cabinet=cabinet;
	}

	@Override
	public String toString() {
		return "[material=" + material + ", \nkants=" + Arrays.toString(kants) + ",\ndimensions=" + dimensions + "];" +"\n";
	}

}
