package models.cabinet.detail;

import model.material.GroupMaterial;
import model.material.Kant;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;

public class Stand extends Detail {
	public Stand(GroupMaterial materials, Dimensions3D dimensions, Options options, Cabinet cabinet) {
		
		super(materials.materialBody,
				new Dimensions2D(dimensions.height - options.heightLeg, dimensions.weight-materials.materialBack.depth),
				new Kant[] {materials.outterKant,null,null,null},cabinet);
	}
	
	@Override
	public String toString() {
		return "Stand \n" + super.toString()+"\n";
	}
}
