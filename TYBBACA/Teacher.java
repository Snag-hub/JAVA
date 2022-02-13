package TYBBACA;

import java.util.*;

public class Teacher {
  static int n;
  int tid[];
  String tname[];
  String sub[];

  public void getData() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter how many Teachers info you want");
    n = s.nextInt();
    tid = new int[n];
    tname = new String[n];
    sub = new String[n];
    System.out.println("................Enter Teachers data................");
    for (int i = 0; i < n; i++) {
      System.out.println("Enter Tid");
      tid[i] = s.nextInt();
      System.out.println("Enter Name of Teacher");
      tname[i] = s.next();
      System.out.println("Enter Subject");
      sub[i] = s.next();
    }

  }

  public void disp() {
    System.out.println("................Details of the Teachers ...............");
    for (int i = 0; i < n; i++) {
      if (sub[i].equals("java")) {
        System.out.println("ROLLNO=" + tid[i]);
        System.out.println("Studnet Name=" + tname[i]);
        System.out.println("percentage=" + sub[i]);
      }
    }
  }

  protected void finalize() {
    System.out.println("Terminating Teacher Class");
  }
}
