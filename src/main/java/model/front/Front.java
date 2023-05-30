package model.front;

import model.material.Kant;
import model.material.Material;
import models.cabinet.Cabinet;
import models.cabinet.Dimensions2D;
import models.cabinet.Options;
import models.cabinet.detail.Detail;

public abstract class Front{
	public Material material;
	public Kant outterKant;
	public Dimensions2D dimensions;
	public Dimensions2D sizes;
	public Options options;
	public Detail detail;
	public Front(Material material, Kant outterKant, Dimensions2D dimensions, Cabinet cabinet, Options options) {
		super();
		this.material = material;
		this.outterKant = outterKant;
		this.dimensions = dimensions;
		this.options=options;
		this.sizes= new Dimensions2D(dimensions.length-options.gapFront, dimensions.weight-options.gapFront);
		this.detail= new Detail(material, sizes, new Kant[] {outterKant,outterKant,outterKant,outterKant}, cabinet);
	}
}

