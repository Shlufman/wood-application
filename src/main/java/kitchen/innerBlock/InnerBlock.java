package kitchen.innerBlock;

import java.util.Stack;

import model.codes.InnerElement;
import models.cabinet.detail.Horizon;

public class InnerBlock {

	public Horizon horizon;
	public Stack<InnerElement> elements;
	public int totalHeight=0;
	
	public InnerBlock(Horizon horizon, Stack<InnerElement> elements) {
		this.horizon= horizon;
		this.totalHeight+=horizon.material.depth;
		this.elements=elements;
		for(int i=0; i<elements.size();i++) {
			this.totalHeight+= elements.get(i).heightSpace;
		}
		
	}
	
}
