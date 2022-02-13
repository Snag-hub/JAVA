//Write a java program to copy the data from one file into another file, while copying change the case of characters in target file and replaces all digits by ‘*’ symbol.

import java.io.*;
import java.util.*;

class slip18b {
  public static void main(String arg[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Provide source file name :");
    String sfile = sc.next();
    System.out.print("Provide destination file name :");
    String dfile = sc.next();
    FileReader fin = new FileReader(sfile);
    FileWriter fout = new FileWriter(dfile, true);
    int c;
    while ((c = fin.read()) != -1) {
      fout.write(c);
    }
    System.out.println("Copy finish...");
    fin.close();
    fout.close();
  }
}