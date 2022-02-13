
/*Slip28_2B)Write a java Program to accept the details of 5 employees (Eno, Ename, Salary) and display it onto the JTable.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Slip28_2 extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3;
	JButton b1, b2;
	String row[][] = new String[5][3];
	static int i = 0;

	Slip28_2() {

		l4 = new JLabel("Counter " + i);
		add(l4);
		l1 = new JLabel("Enter Eno");
		add(l1);
		t1 = new JTextField(20);
		add(t1);
		l2 = new JLabel("Enter Ename");
		add(l2);
		t2 = new JTextField(20);
		add(t2);
		l3 = new JLabel("Enter Salary");
		add(l3);
		t3 = new JTextField(20);
		add(t3);
		b1 = new JButton("Add");
		add(b1);

		b2 = new JButton("Submit");
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			row[i][0] = t1.getText(); // Eno
			row[i][1] = t2.getText();// Ename
			row[i][2] = t3.getText();// "4556"
			t1.setText(" ");
			t2.setText("");
			t3.setText("");
			i++; // 1
			l4.setText("Counter :" + i);
		}
		if (e.getSource() == b2) {
			String column[] = { "ENo", "EName", "Salary" };

			JTable t = new JTable(row, column);
			JScrollPane s = new JScrollPane(t);
			add(s);

		}

	}

	public static void main(String args[]) {
		new Slip28_2();

	}

}