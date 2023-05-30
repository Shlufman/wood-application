package kitchen;

import kitchen.specification.DoorFrontSpecification;
import kitchen.specification.GroupFront;
import kitchen.specification.SetterFront;
import model.codes.Facing;
import model.material.Coat;
import model.material.GroupMaterial;
import model.material.Kant;
import model.material.Material;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;

public class kitchenAppl {

	public static void main(String[] args) {

		Material backPishtan;
		{
			Coat face = new Coat(1, Facing.FORMICA, "pishtan", "code 1", "producer 1");
			backPishtan = new Material(1, "dikt", face, null, 5, 0);
		}

		Material diktPishtan;
		{
			Coat face = new Coat(1, Facing.FORMICA, "pishtan", "code 1", "producer 1");
			diktPishtan = new Material(2, "dikt", face, face, 16, 0);
		}

		Material mdf_formica_double_17;
		{
			Coat face = new Coat(1, Facing.FORMICA, "pishtan", "code 2", "producer 1");
			Coat back = new Coat(1, Facing.FORMICA, "pishtan", "code 3", "producer 1");
			mdf_formica_double_17 = new Material(3, "back Pishtan", face, back, 17, 0);
		}

		Kant innerKant = new Kant(1, "1", "producer 2", "pishtan", 0);
		Kant outterKant = new Kant(2, "2", "producer 2", "color", 0);

		GroupMaterial materials = new GroupMaterial(diktPishtan, mdf_formica_double_17, backPishtan, innerKant,
				outterKant);

		Dimensions3D dimensions = new Dimensions3D(600, 880, 570);
		Options options = new Options();
		Cabinet cabinet1 = new Cabinet(1, materials, dimensions, options);
		
		SetterFront setterLevel_1 = new SetterFront(materials, options, 300);
		SetterFront setterLevel_2 = new SetterFront(materials, options, 300);
		SetterFront setterLevel_3 = new SetterFront(materials, options);

		GroupFront groupFront = new GroupFront(cabinet1, options);
		groupFront.add(setterLevel_1);
		groupFront.add(setterLevel_2);
		groupFront.add(setterLevel_3);
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}

		Cabinet cabinet2 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet2, options);
		groupFront.add(new SetterFront(materials, options));
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
		
		dimensions = new Dimensions3D(300, 880, 570);
		Cabinet cabinet3 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet3, options);
		groupFront.add(new SetterFront(materials, options));
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
		
		
		dimensions = new Dimensions3D(400, 880, 570);
		Cabinet cabinet4 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet4, options);
		DoorFrontSpecification door = new DoorFrontSpecification( materials,  options,  cabinet4);
		SetterFront setterLevel = new SetterFront(0, 1, door);
		groupFront.add(setterLevel);
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
		
		
		dimensions = new Dimensions3D(400, 880, 570);
		Cabinet cabinet5 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet5, options);
		door = new DoorFrontSpecification( materials,  options,  cabinet5);
		setterLevel = new SetterFront(0, 2, door);
		groupFront.add(setterLevel);
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
		
		dimensions = new Dimensions3D(700, 880, 570);
		Cabinet cabinet6 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet6, options);
		door = new DoorFrontSpecification( materials,  options,  cabinet6);
		setterLevel = new SetterFront(400, 2, door);
		groupFront.add(setterLevel);
		groupFront.add(new SetterFront(materials, options));
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
		
		
		dimensions = new Dimensions3D(600, 880, 570);
		Cabinet cabinet7 = new Cabinet(2, materials, dimensions, options);
		groupFront = new GroupFront(cabinet7, options);
		setterLevel = new SetterFront(materials, options,385);
		groupFront.add(setterLevel);
		groupFront.add(new SetterFront(materials, options));
		if (groupFront.finished()) {
			System.out.println(groupFront);
		}
	}
}
