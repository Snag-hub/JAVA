
//Write an applet application in Java for smile face.
import java.applet.Applet;
import java.awt.*;

public class Slip15b extends Applet {
  public void paint(Graphics g) {
    g.drawOval(50, 15, 200, 200);
    g.drawOval(80, 90, 30, 15);
    g.fillOval(190, 90, 30, 15);
    g.drawLine(150, 110, 150, 150);
    g.drawArc(100, 160, 100, 30, 170, 200);
  }
}
/* <applet code="Slip15b.class" width="300" height="300"> </applet> */