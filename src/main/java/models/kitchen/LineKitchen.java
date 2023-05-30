package models.kitchen;

import model.material.GroupMaterial;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;
import models.cabinet.SpecificationCabinet;

public class LineKitchen extends AbstractKitchen{

	public LineKitchen(GroupMaterial materials, Dimensions3D dimansionKitchen, SpecificationCabinet[] specifications,
			Options options) {
		super(materials, dimansionKitchen, specifications, options);
		
	}

	@Override
	public String toString() {
		return "LineKitchen []" + super.toString();
	}


	

}
