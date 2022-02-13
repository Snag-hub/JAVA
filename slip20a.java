//Write a java program using AWT to create a Frame with title TYBBACA, background color RED. If user clicks on close button then frame should close.

import java.awt.*;
import java.awt.event.*;

class slip20a extends Frame implements WindowListener {

  slip20a() {
    setVisible(true);
    setSize(500, 500);
    setTitle("TYBBA(CA)");
    setBackground(Color.red);
    addWindowListener(this);

  }

  public void windowActivated(WindowEvent e) {
  }

  public void windowDeiconified(WindowEvent e) {
  }

  public void windowOpened(WindowEvent e) {
  }

  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  public void windowIconified(WindowEvent e) {
  }

  public void windowDeactivated(WindowEvent e) {
  }

  public void windowClosed(WindowEvent e) {
  }

  public static void main(String args[]) {
    slip20a s = new slip20a();

  }

}