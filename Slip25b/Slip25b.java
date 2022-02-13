import Series.FibonacciEx;
import Series.Cub;
import Series.Square;
import java.util.*;

class Slip25b {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any no");
    int n = s.nextInt();
    System.out.println("...........Fibonacci Series of given no.........");
    FibonacciEx f = new FibonacciEx();
    f.fib(n);
    System.out.println("...........Cube of Numbers...........");
    Cub c = new Cub();
    c.cub(n);
    System.out.println("...........Square of Numbers...........");
    Square s1 = new Square();
    s1.squ(n);
  }

}