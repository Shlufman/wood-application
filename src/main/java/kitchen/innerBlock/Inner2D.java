package kitchen.innerBlock;

import java.util.Stack;

public class Inner2D {
	public int totalHeight;
	public Stack<Integer> stack = new Stack<>();

	public Inner2D() {
		super();
	}

	public boolean add(Integer i) {
		totalHeight += i;
		return stack.add(i);
	}

	public boolean removeByIndex(int index) {
		Integer el = stack.remove(index);
		if (el != null) {
			totalHeight -= el;
			return true;
		}
		return false;
	}
}
