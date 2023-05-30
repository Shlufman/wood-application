package kitchen.specification;

import model.material.GroupMaterial;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Options;

public class FrontSpecification {
	public GroupMaterial materials;
	public Options options;
	public Cabinet cabinet;
	public Dimensions2D dimensions2d;
	
	public FrontSpecification(GroupMaterial materials, Options options,Cabinet cabinet) {
		super();
		this.materials = materials;
		this.options = options;
		this.cabinet = cabinet;
	}

	@Override
	public String toString() {
		return "FrontSpecification [material=" + ", dimensions2d=" + dimensions2d + "]";
	}
	
	
}
