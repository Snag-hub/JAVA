
/* Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and display the position of the Mouse_Click in a TextField.*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="Slip2b.class" width=500 height=500></applet>
public class Slip2b extends Applet {
    TextField t;
    int x = 0, y = 0;
    String s = " ";
    public void init() {
        t = new TextField(20);
        add(t);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX(); // returns x position 30 i.e x=30
                y = e.getY();// return Y
                t.setText("Mouse Clicked=X:" + x + " Y:=" + y);
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                s = "Mouse Moved";
                repaint();
            }
        });
    }
    public void paint(Graphics g) {
        g.drawString(s + "X=" + x + "Y=" + y, 100, 100);
    }
}