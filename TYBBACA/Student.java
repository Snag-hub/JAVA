package TYBBACA;

import java.util.*;

public class Student {

  static int n;
  int rno[];
  String sname[];
  float per[];

  public void getData() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter how many students info you want");
    n = s.nextInt();
    rno = new int[n];
    sname = new String[n];
    per = new float[n];
    System.out.println("................Enter Students data................");
    for (int i = 0; i < n; i++) {
      System.out.println("Enter RNo");
      rno[i] = s.nextInt();
      System.out.println("Enter Name of Student");
      sname[i] = s.next();
      System.out.println("Enter Percetage");
      per[i] = s.nextFloat();
    }
  }

  public void disp() {
    System.out.println("................Details of the Students ................");
    for (int i = 0; i < n; i++) {
      System.out.println("ROLLNO=" + rno[i]);
      System.out.println("Studnet Name=" + sname[i]);
      System.out.println("percentage=" + per[i]);
    }
  }

  protected void finalize() {
    System.out.println("Terminating Student Class");
  }
}