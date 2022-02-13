import java.awt.*;
import java.awt.event.*;

class Slip10b extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3, t4, t5;
    Button b1, b2, b3;
    Font f;
    Font f1;

    Slip10b() {
        l6 = new Label("Compund Intrest Calculator");
        l1 = new Label("Principal Amount");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);
        t1 = new TextField(20);
        add(t1);
        l2 = new Label("Intrest Rate(%)");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        add(l2);
        t2 = new TextField(5);
        add(t2);
        l3 = new Label("Time(Yrs)");
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        add(l3);
        t3 = new TextField(10);
        add(t3);
        l4 = new Label("Total Amount");
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        add(l4);
        t4 = new TextField(25);
        add(t4);
        l5 = new Label("Intrest Amount");
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        add(l5);
        t5 = new TextField(30);
        add(t5);
        b1 = new Button("Calculate");
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        add(b1);
        b2 = new Button("Clear");
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        add(b2);
        b3 = new Button("Exit");
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        add(b3);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(500, 400);
        setVisible(true);
        setTitle("Compound Intrest Calculator");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());
            double c = p * Math.pow(1 + r / 100, t);
            t4.setText(String.valueOf(c));
            double i = c - p;
            t5.setText(String.valueOf(i));
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        if (e.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Slip10b d = new Slip10b();
    }
}