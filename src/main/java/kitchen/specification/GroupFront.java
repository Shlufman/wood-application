package kitchen.specification;

import java.util.ArrayList;

import models.cabinet.Cabinet;
import models.cabinet.Options;

public class GroupFront {

	public ArrayList<SetterFront> frontLevels = new ArrayList<>();
	public Cabinet cabinet;
	public Options options;

	public GroupFront(Cabinet cabinet, Options options) {
		this.cabinet = cabinet;
		this.options = options;
	}

	public GroupFront add(SetterFront setterFront) {
		frontLevels.add(setterFront);
		return this;
	}

	public boolean finished() {
		int height = 0;
		if(frontLevels.size()!=1) {
		for (SetterFront frontLevel : frontLevels) {
			height += frontLevel.height;
		}
		}else {
			frontLevels.get(0).height=cabinet.dimensions.height - options.upGapFront- options.heightLeg;
		}
		if (height < (cabinet.dimensions.height)) {
			if (frontLevels.size() != 1)
			frontLevels.get(frontLevels.size() - 1).height = cabinet.dimensions.height - height - options.upGapFront 
					- options.heightLeg;
			
			for (SetterFront frontLevel : frontLevels) {
				frontLevel.setCabinet(cabinet);
				frontLevel.setDimensions();
			}

			for(FrontSpecification specification:frontLevels.get(frontLevels.size() - 1).specifications)
			specification.dimensions2d.weight+=options.gapFront;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "GroupFront [frontLevels=" + frontLevels + "]";
	}

}
