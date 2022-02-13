import java.awt.*;
import java.awt.event.*;

class Slip27b extends Frame {
  TextField tf;
  Button b1;
  Label l1;
  List l;

  Slip27b() {
    setTitle("Frame");
    setSize(800, 600);
    setVisible(true);
    setLayout(new FlowLayout());
    tf = new TextField(20);
    add(tf);
    b1 = new Button("Click");
    add(b1);
    l1 = new Label("List");
    add(l1);
    l = new List(5, true);
    add(l);
    l.setSize(400, 200);
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l.add(tf.getText());
      }
    });
  }

  public static void main(String[] args) {
    Slip27b s = new Slip27b();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      l.add(tf.getText());
    }
  }
}
