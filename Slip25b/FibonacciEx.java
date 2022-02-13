package Series;

public class FibonacciEx {

  public void fib(int n) {
    int n1 = 0, n2 = 1, n3, i;
    System.out.print(n1 + " " + n2);// printing 0 and 1
    for (i = 2; i < n; ++i) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
