//Write a java program to check whether given file is hidden or not. If not then display its path, otherwise display appropriate message. 

import java.io.File;

public class slip23a {
  public static void main(String[] args) {
    try {
      File file = new File("yoy.txt");
      file.createNewFile();
      System.out.println("Is file hidden? " + file.isHidden());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}