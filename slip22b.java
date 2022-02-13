/*Write a java program for the following: [25 M]
1. To create a file.
2. To rename a file.
3. To delete a file.
4. To display path of a file
*/

import java.util.*;
import java.io.*;
import java.io.File;

class slip22b {
  static String str;
  static int n;

  public static void main(String args[]) throws IOException {

    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your file name");
    str = b.readLine();
    Scanner s = new Scanner(System.in);
    File f = new File(str);
    do {
      System.out.println("Enter your choice");
      System.out.println("1.Create a file");
      System.out.println("2.Rename a file");
      System.out.println("3.Delete a file");
      System.out.println("4.Display path of a file");
      System.out.println("5.Exit");
      n = s.nextInt();
      switch (n) {
        case 1:
          if (f.exists())
            System.out.println("File is already present");
          else
            f.createNewFile(); // Creating new file
          System.out.println("File is created" + f.getName());
          break;
        case 2:
          System.out.println("Enter name which you want to give");
          String str1 = b.readLine();
          File f1 = new File(str1);
          boolean flag = f.renameTo(f1);
          if (flag == true) {
            System.out.println("File Successfully Rename");
            System.out.println("Rename file=" + f1.getName());
          } else {
            System.out.println("Operation Failed");
          }
          break;
        case 3:
          if (f.exists())
            System.out.println("File is already present");
          f.delete(); // deleting existing file
          System.out.println("File is Deleted Successfully");
          break;
        case 4:
          System.out.println("Absolute path is=" + f.getAbsolutePath());
          break;
        case 5:
          System.exit(0);

      }

    } while (n != 5);

  }

}