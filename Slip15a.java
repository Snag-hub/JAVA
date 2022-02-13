
//Write a java program to search given name into the array, if it is found then display its index otherwise display appropriate message.
import java.util.*;

class Slip15a {
  public static void main(String[] args) {
    String a[] = new String[5];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.println("Enter the name");
      a[i] = s.nextLine();
    }
    System.out.println("Enter the name to be searched");
    String name = s.nextLine();
    for (int i = 0; i < a.length; i++) {
      if (a[i].equals(name)) {
        System.out.println("The name is found at index " + i);
        break;
      }
    }

  }
}