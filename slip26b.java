//Write a java program using applet to draw Temple. 

import java.applet.Applet;
import java.awt.*;

public class slip26b extends Applet {
  public void paint(Graphics g) {
    g.drawRect(100, 150, 90, 120);
    g.drawRect(130, 230, 20, 40);
    g.drawLine(150, 100, 100, 150);
    g.drawLine(150, 100, 190, 150);
    g.drawLine(150, 50, 150, 100);
    g.drawRect(150, 50, 20, 20);
  }
}
//<applet code="slip26b.class" width="500" height="500"></applet>
