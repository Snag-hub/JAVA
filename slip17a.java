//Write a java Program to accept ‘n’ no’s through command line and store only armstrong no’s into the array and display that array

import java.io.*;
import java.util.*;

class slip17a {
  public static void main(String[] args) {
    int n, i, j, sum, temp;
    int[] arr = new int[10];
    int[] armstrong = new int[10];
    int count = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of no's you want to enter:");
    n = s.nextInt();
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter all the no's:");
    for (i = 0; i < n; i++) {
      arr[i] = s1.nextInt();
    }
    for (i = 0; i < n; i++) {
      sum = 0;
      temp = arr[i];
      while (temp != 0) {
        sum = sum + (temp % 10) * (temp % 10) * (temp % 10);
        temp = temp / 10;
      }
      if (sum == arr[i]) {
        armstrong[count] = arr[i];
        count++;
      }
    }
    System.out.print("Armstrong no's are:");
    for (i = 0; i < count - 1; i++) {
      System.out.print(armstrong[i] + ",");
    }
    System.out.print(armstrong[count - 1]);
  }
}