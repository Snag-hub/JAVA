//Write a java program to display multiplication table of a given number into the List box by clicking on button

import java.util.Scanner;

class Slip12b {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Input a number: ");
    int num1 = in.nextInt();

    for (int i = 0; i < 10; i++) {
      System.out.println(num1 + " x " + (i + 1) + " = " +
          (num1 * (i + 1)));
    }
  }
}