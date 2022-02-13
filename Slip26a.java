
//Write a java program to display ASCII values of the characters from a file.
import java.io.*;

public class Slip26a {
  public static void main(String args[]) throws IOException {

    FileInputStream fin = new FileInputStream("D:/College/BBA(CA)Sem5th/java/Programs/Slips/Nothing/anu.txt");
    int i;
    while ((i = fin.read()) != -1) {
      System.out.println(i);
    }
    fin.close();
  }
}