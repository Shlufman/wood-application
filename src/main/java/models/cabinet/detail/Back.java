package models.cabinet.detail;

import model.material.GroupMaterial;
import model.material.Kant;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;

public class Back extends Detail {
	public Back(GroupMaterial materials, Dimensions3D dimensions, Options options, Cabinet cabinet) {
		super(materials.materialBody,
				new Dimensions2D(dimensions.length - options.deltaBack, dimensions.height-options.deltaBack),
				new Kant[] {null,null,null,null} , cabinet);
	}

	@Override
	public String toString() {
		return "Back\n[material=" + material 
				+ ", dimensions=" + dimensions + "]\n";
	}


	
}
