package model.material;

public class GroupMaterial {
	public Material materialBody;
	public Material materialFront;
	public Material materialBack;
	public Kant innerKant;
	public Kant outterKant;
	public GroupMaterial(Material materialBody, Material materialFront, Material materialBack, Kant innerKant,
			Kant outterKant) {
		super();
		this.materialBody = materialBody;
		this.materialFront = materialFront;
		this.materialBack = materialBack;
		this.innerKant = innerKant;
		this.outterKant = outterKant;
	}
	@Override
	public String toString() {
		return "GroupMaterial [materialBody=" + materialBody + ", materialFront=" + materialFront + ", materialBack="
				+ materialBack + ", innerKant=" + innerKant + ", outterKant=" + outterKant + "]";
	}
	
	
}
