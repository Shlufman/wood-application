package kitchen.specification;

import java.util.ArrayList;

import model.material.GroupMaterial;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Options;

public class SetterFront {
	public int height = 0;
	public int count = 1;
	public ArrayList<FrontSpecification> specifications = new ArrayList<>();
	public int level;
	public GroupMaterial materials;
	public Options options;
	public Cabinet cabinet;

	public SetterFront(GroupMaterial materials, Options options) {
		specifications.add(new DrawerFrontSpecification(materials, options, cabinet));
		this.options = options;
		this.materials = materials;
	}

	public SetterFront(GroupMaterial materials, Options options, int height) {
		specifications.add(new DrawerFrontSpecification(materials, options, cabinet));
		this.options = options;
		this.materials = materials;
		this.height = height;
	}

	public SetterFront(int height, int count, DoorFrontSpecification specification) {
		super();
		this.options = specification.options;
		this.materials = specification.materials;
		this.height = height;
		this.count = count;
		for (int i = 0; i < count; i++)
			this.specifications.add(specification);
	}

	public void setDimensions() {
		if (cabinet != null) {
			Dimensions2D dimensions2d = new Dimensions2D(cabinet.dimensions.length / this.count - options.gapFront,
					height - options.gapFront);
			for(FrontSpecification specification:specifications)
			specification.dimensions2d = dimensions2d;
		}
	}

	@Override
	public String toString() {

		return "SetterFront [height=" + height + " specification= " + specifications + "]";
	}

	public void setCabinet(Cabinet cabinet) {
		this.cabinet = cabinet;
	}

}
