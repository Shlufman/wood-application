package model.codes;

import java.util.ArrayList;
import java.util.List;

import model.material.Material;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;
import models.cabinet.detail.Detail;

public abstract class InnerElement {
	public int heightSpace;
	public Material material;
	public List<Detail> details = new ArrayList<Detail>();
	
	public InnerElement(int heightSpace, Material material, Dimensions3D dimensions, Options options) {
		super();
		this.heightSpace = heightSpace;
		this.material = material;
	}
	
}
