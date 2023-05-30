package kitchen.innerBlock;

import models.cabinet.Dimensions3D;

public class Model {
	public String name;
	public String productCode;
	public Dimensions3D dimensions3d;
	
	public Model(String name, String productCode, Dimensions3D dimensions3d) {
		super();
		this.name = name;
		this.productCode = productCode;
		this.dimensions3d = dimensions3d;
	}
	
}
