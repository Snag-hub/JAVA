//Write a java program to display Label with text Dr. D Y Patil College, background color Red and font size 20 on the frame

import java.awt.*;

public class slip7A {
  public static void main(String args[]) {

    // creating the object of Frame class and Label class
    Frame f = new Frame("Dr. D Y Patil College");
    Label l1;
    l1 = new Label("Dr. D Y Patil College");
    l1.setBackground(Color.red);
    l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
    f.add(l1);
    f.setSize(300, 300);
    f.setVisible(true);
    
  }
}