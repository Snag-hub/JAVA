//Write a ‘java’ program to copy only non-numeric data from one file to another file

import java.io.*;
import java.util.*;

class slip1b {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("D:\\College\\BBA(CA)Sem5th\\java\\Programs\\Slips\\Nothing\\anu.txt");
    FileOutputStream fos = new FileOutputStream("D:\\College\\BBA(CA)Sem5th\\java\\Programs\\Slips\\Nothing\\anu1.txt");
    int i;
    while ((i = fis.read()) != -1) {
      if (Character.isDigit(i)) {
        continue;
      }
      fos.write(i);
    }
    fis.close();
    fos.close();
  }
}