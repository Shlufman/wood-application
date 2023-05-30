package model.codes;


public enum CodeCabinet {

	ONE_DOOR_LOWER_COLOR(1, Level.BOTTON, new Drawer[] {null,null,null}, Facing.COLOR), 
	TWO_DOOR_LOWER_COLOR(2, Level.BOTTON, new Drawer[] {null,null,null}, Facing.COLOR),
	ONE_DOOR_LOWER_FORMICA(1, Level.BOTTON, new Drawer[] {null,null,null}, Facing.FORMICA), 
	TWO_DOOR_LOWER_FORMICA(2, Level.BOTTON, new Drawer[] {null,null,null}, Facing.COLOR),
	ONE_OUTER_DRAWER_FULL_SIZE_LOWER_COLOR(0, Level.BOTTON, new Drawer[] {null}, Facing.COLOR),
	TWO_OUTER_DRAWER_HALF_SIZE_LOWER_COLOR(0, Level.BOTTON, new Drawer[] {null,null,null}, Facing.COLOR),
	THREE_OUTER_DRAWER_LOWER_COLOR(0, Level.BOTTON, new Drawer[] {null,null,null}, Facing.COLOR),
	ONE_OUTER_DRAWER_FULL_SIZE_LOWER_FORMICA(0, Level.BOTTON, new Drawer[] {null,null,null}, Facing.FORMICA),
	TWO_OUTER_DRAWER_HALF_SIZE_LOWER_FORMICA(0, Level.BOTTON, new Drawer[] {null,null,null}, Facing.FORMICA),
	THREE_OUTER_DRAWER_LOWER_FORMICA(0, Level.BOTTON, new Drawer[] {null,null,null}, Facing.FORMICA);


	public int countDoor;
	public Level lower;
	public Drawer[] drawers;
	public Facing color;

	private CodeCabinet(int countDoor, Level lower, Drawer[] drawers, Facing color) {
		this.countDoor = countDoor;
		this.lower = lower;
		this.drawers = drawers;
		this.color = color;
	}
}
