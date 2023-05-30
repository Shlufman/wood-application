package kitchen.innerBlock;

import java.util.Stack;

import model.codes.InnerElement;
import models.cabinet.Cabinet;

public class InnerCabinet {
	public Stack<InnerElement> stack = new Stack<>();
	public int height = 0;
	public Cabinet cabinet;

	public InnerCabinet(Cabinet cabinet) {
		super();
		this.cabinet = cabinet;
	}

	public InnerCabinet add(InnerElement element) {
		if(!check(element)) return this;
		this.stack.add(element);
		this.height += element.heightSpace;
		return this;
	}

	public boolean check(InnerElement element) {
		if (this.height + element.heightSpace > cabinet.dimensions.height)
			return false;

		return true;
	}
}
