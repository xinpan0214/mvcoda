package theme;

import gfxelement.GFXElement;
import gfxelement.chart.ChartStrap;
import gfxelement.chart.ChartText;
import gfxelement.logo.FourMusic1;
import gfxelement.logo.QLogo;
import gfxelement.strap.Periscope;
import gfxelement.strap.QStrap;
import gfxelement.transition.QTransition;
import lombok.Getter;

public class Classic extends Theme {

@Getter private String directory  = super.getDirectory() + this.getClass().getSimpleName() + "/";
//http://stackoverflow.com/questions/6271417/java-get-the-current-class-name

@Getter private GFXElement logo = new QLogo(this);

@Getter private GFXElement strap = new QStrap(this);

@Getter private GFXElement transition = new QTransition(this);

public GFXElement getChart1() {return null;}

public GFXElement getChart2() {return null;}


}
