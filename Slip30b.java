//Write a java program to design a following GUI (Use Swing)

import javax.swing.*;
import java.awt.*;


class Slip30b extends JFrame {
  JTextField t1, t2, t3, t4;
  JLabel l1, l2, l3, l4,l5,l6,l7;
  JButton b1, b2;
  JRadioButton r1, r2;
  JCheckBox c1, c2, c3;



  Slip30b(){
    setLayout(new FlowLayout());
    setTitle("Slip 30b");
    setSize(250,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l7 = new JLabel("Person Details");
    l1 = new JLabel("Enter First Name");
    t1 = new JTextField(20);
    l2 = new JLabel("Enter Last Name");
    t2 = new JTextField(20);
    l3 = new JLabel("Enter Address");
    t3 = new JTextField(20);
    l4 = new JLabel("Mobile Number");
    t4 = new JTextField(20);
    l5 = new JLabel("Gender");
    r1 = new JRadioButton("Male");
    r2 = new JRadioButton("Female");
    l6 = new JLabel("Your Intrest");
    c1 = new JCheckBox("Cricket");
    c2 = new JCheckBox("Football");
    c3 = new JCheckBox("Other");
    b1 = new JButton("Submit");
    b2 = new JButton("Reset");
    
    add(l7);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(l4);
    add(t4);
    add(l5);
    add(r1);
    add(r2);
    add(l6);
    add(c1);
    add(c2);
    add(c3);
    add(b1);
    add(b2);
  }
  public static void main(String[] args) {
    Slip30b s = new Slip30b();
  }
}