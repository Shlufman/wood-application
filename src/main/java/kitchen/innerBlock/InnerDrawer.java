package kitchen.innerBlock;

import model.codes.InnerElement;
import model.material.Material;
import models.cabinet.Dimensions3D;
import models.cabinet.Options;

public class InnerDrawer extends InnerElement{
	public boolean withTopHorizon;
	public int heightSpace;
	public int weigth;
	public Model model;
	public InnerDrawer(int heightSpace, Material material, Dimensions3D dimensions, Options options) {
		super(heightSpace, material, dimensions, options);
		// TODO Auto-generated constructor stub
	}
	

	

}
