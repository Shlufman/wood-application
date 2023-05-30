package models.cabinet.detail;

import model.material.GroupMaterial;
import model.material.Kant;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;

public class Laist extends Detail{
	public Laist(GroupMaterial materials, Dimensions3D dimensions, Options options, Cabinet cabinet) {
		super(materials.materialBody,
				new Dimensions2D(dimensions.length - materials.materialBody.depth * 2, options.baseWeigthLaist),
				new Kant[] {materials.outterKant,null,null,null} ,cabinet);
	}
	
	@Override
	public String toString() {
		return "Laist \n" + super.toString()+"\n";
	}
}
