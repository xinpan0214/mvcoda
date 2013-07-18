package gfxelement.logo;

import lombok.Getter;
import theme.Theme;

public class QLogo extends Logo {
	
	@Getter public int firstHoldFrame = 84;
	@Getter public int lastHoldFrame = 84;
	@Getter public int numberOfFrames = 86;
	
	@Getter public int xOffsetSD = 65;
	@Getter public int yOffsetSD = 0;
	
	public QLogo(Theme theme) {
		super(theme);
	}

	@Getter private String directory =  super.getDirectory() +  "QLogo";
}
