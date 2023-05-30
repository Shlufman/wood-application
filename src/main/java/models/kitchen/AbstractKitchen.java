package models.kitchen;

import java.util.ArrayList;
import java.util.List;

import model.material.GroupMaterial;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;
import models.cabinet.SpecificationCabinet;

public abstract class AbstractKitchen {

	public GroupMaterial materials;
	public Options options;
	public Dimensions3D dimensionKitchen;

	public List<Cabinet> cabinets = new ArrayList<Cabinet>();
	protected SpecificationCabinet[] specifications;
	
	
	public AbstractKitchen(GroupMaterial materials, Dimensions3D dimensionKitchen ,SpecificationCabinet[] specifications , Options options) {//
		super();
		this.materials = materials;
		this.options =options;
		this.dimensionKitchen =dimensionKitchen;
		this.specifications = specifications;
		
		Dimensions3D dimensions = null;
		Cabinet cabinet = null;
		int index =1;
		for(SpecificationCabinet specification: specifications) {
			dimensions = new Dimensions3D(specification.length,dimensionKitchen. height, dimensionKitchen.weight);
			cabinet = new Cabinet(index++,materials, dimensions, specification, options);
			cabinets.add(cabinet);
			
		}
	}

	@Override
	public String toString() {
		return "AbstractKitchen [cabinets=" + cabinets + "]";
	}



//	private void setCabinets() {
//		for (int i = 0; i < 10; i++) {
//			cabinets.add(new Cabinet(i, specifications[i].code, materialBody, materialFront, baseFormicaFace,
//					baseFormicaBack, baseDepth, specifications[i].length, baseWeight, baseHight, basekant));
//		}
//	}



//	for(int i= 0; i<10 ; i++) {
//		kitchen.add(new Cabinet(i,"dikt","pishtan","pishtan", 16,sizes[i],570,780,"standert"));
//	}

//	kitchen.forEach(System.out::println);
}
