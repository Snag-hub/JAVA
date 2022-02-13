/*SLIP 14_2. Write a Java Program to accept the details of Employee(Eno, EName,Sal) from the user and display it on the next Frame. (Use AWT)*/
import java.awt.*;

public class Slip14b extends Frame implements ActionListener{
  Label l1, l2, l3;
  TextField t1, t2, t3;
  Button b1, b2;

  // Panel p;
  Slip14b() { // p=new Panel();
    l1 = new Label("Eno");
    l2 = new Label("EName");
    l3 = new Label("Sal");
    t1 = new TextField(30);
    t2 = new TextField(30);
    t3 = new TextField(30);
    b1 = new Button("Submit");
    b2 = new Button("'Clear");
    setLayout(null);
    l1.setBounds(100, 80, 50, 20);
    l2.setBounds(100, 110, 50, 20);
    l3.setBounds(100, 140, 50, 20);
    t1.setBounds(160, 80, 100, 20);
    t2.setBounds(160, 110, 100, 20);
    t3.setBounds(160, 140, 100, 20);
    b1.setBounds(150, 170, 50, 30);
    b2.setBounds(210, 170, 50, 30);
    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    setVisible(true);
    setSize(400, 400);
    setTitle("Employee Information");
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      new Employee_Detail(t1.getText(), t2.getText(), t3.getText());
    }

    if (e.getSource() == b2)
      t1.setText(" ");
    t2.setText(" ");
    t3.setText(" ");
  }

  public static void main(String a[]) {
    Slip14b s=new Slip14b();
  }
}