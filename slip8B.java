//Write a java program to display the files having extension .txt from a given directory. 

import java.io.File;

class slip8B {

  public static void main(String[] args) {
    File file = new File("D:\\College\\BBA(CA)Sem5th\\java\\Programs\\Slips\\Nothing");
    String[] list = file.list();
    for (String fileName : list) {
      if (fileName.endsWith(".txt")) {
        System.out.println(fileName);
      }
    }
  }
}