package models.cabinet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import kitchen.innerBlock.InnerCabinet;
import model.codes.InnerElement;
import model.front.Front;
import model.material.GroupMaterial;
import models.cabinet.detail.Back;
import models.cabinet.detail.Detail;
import models.cabinet.detail.Horizon;
import models.cabinet.detail.Laist;
import models.cabinet.detail.Stand;

public class Cabinet {

	public Integer id;
	public GroupMaterial materials;
	public Dimensions3D dimensions;
	public SpecificationCabinet specifications;
	public Options options;
	public Integer freeHeight;

	public InnerCabinet innerCabinet;

	public List<Detail> details = new ArrayList<Detail>();

	public List<Front> fronts = new ArrayList<Front>();
	public Stack<InnerElement> stack = new Stack<>();

	public Cabinet(int id, GroupMaterial materials, Dimensions3D dimensions, Options options) {
		super();
		this.id = id;
		this.materials = materials;
		this.dimensions = dimensions;
		this.options = options;

		Horizon horizon = new Horizon(materials,dimensions, options, this);
		details.add( horizon);
		Stand stand = new Stand(materials, dimensions, options, this);
		details.add(stand);
		details.add(new Stand(materials, dimensions, options, this));
		Laist laist = new Laist(materials, dimensions, options, this);
		details.add(laist);
		details.add(new Laist(materials, dimensions, options, this));
		details.add(new Back(materials, dimensions, options, this));
		this.freeHeight=stand.dimensions.length-horizon.material.depth-laist.material.depth;
	}

	public Cabinet(int id, GroupMaterial materials, Dimensions3D dimensions, SpecificationCabinet specifications,
			Options options) {
		super();
		this.id = id;
		this.materials = materials;
		this.specifications = specifications;
		this.dimensions = dimensions;
		this.options = options;

		details.add( new Horizon(materials,dimensions, options, this));
		details.add(new Stand(materials, dimensions, options, this));
		details.add(new Stand(materials, dimensions, options, this));
		details.add(new Laist(materials, dimensions, options, this));
		details.add(new Laist(materials, dimensions, options, this));
		details.add(new Back(materials, dimensions, options, this));
	}

	public void addInnerCabinet(InnerCabinet innerCabinet) {
		this.innerCabinet = innerCabinet;
	}
	
//	public boolean addInnerCabinet(InnerElement innerElement) {
//		this.stack.add(innerElement);
//		if(stack.size()==1) {
//			if(innerElement.getClass().getSimpleName()=="OutterDrawer") {
//				Dimensions2D dimensions =
//						new Dimensions2D(this.dimensions.length, innerElement.heightSpace+materials.materialBody.depth); //int length, int weight
//				FrontDrawer frontDrawer =new FrontDrawer(materials.materialFront, materials.outterKant, dimensions,this,options);
//				return true;
//			} else if(innerElement.getClass().getSimpleName()=="InnerDrawer"){
//				Dimensions2D dimensions =
//						new Dimensions2D(this.dimensions.length, innerElement.heightSpace+materials.materialBody.depth); //int length, int weight
//				FrontDoor frontDoor =new FrontDoor(materials.materialFront, materials.outterKant, dimensions,this,options);
//				return true;
//			}
//			
//		}else {
//			if(innerElement.getClass().getSimpleName()=="OutterDrawer") {
//				Dimensions2D dimensions =
//						new Dimensions2D(this.dimensions.length, innerElement.heightSpace); //int length, int weight
//				FrontDrawer frontDrawernew =new FrontDrawer(materials.materialFront, materials.outterKant, dimensions,this,options);
//				return true;
//			}
//		}
//		return true;
//	}

	@Override
	public String toString() {
		String detailsString = "";
		for (Detail detail : details) {
			detailsString += detail.toString() + "\n";
		}
		return "Cabinet " + id + " [details=\n" + detailsString + "]\n";
	}

//	public class Back extends Detail{
//		public Back() {
//			super(baseMaterial, baseDepth, baseFormicaFace, null, baseLength -deltaBack,
//					baseHigth-deltaBack, baseDepthhBack,  null, new Boolean[] { false, false, false, false });
//			details.add(this);
//		}
//		
//		@Override
//		public String toString() {
//			return "Back \n" + super.toString();
//		}
//	}

}
