package models.cabinet;

public class Options {

	public int heightLeg =100;
	public int baseWeigthLaist = 60;
	public int deltaBack = 2;
	public int deltaWeigthShelf=10;
	public int gapFront =3;
	public int upGapFront = 10;
	
	public Options() {
		super();
	}
	
	public Options(int heightLeg, int baseWeigthLaist, int deltaBack) {
		super();
		this.heightLeg = heightLeg;
		this.baseWeigthLaist = baseWeigthLaist;
		this.deltaBack = deltaBack;
	}
	@Override
	public String toString() {
		return "Options [heightLeg=" + heightLeg + ", baseWeigthLaist=" + baseWeigthLaist + ", deltaBack=" + deltaBack
				+ "]";
	}
	
	
}
