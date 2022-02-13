//Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading) 

class OverloadDemo {
  void area(float x) {
    System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
  }

  void area(float x, float y) {
    System.out.println("the area of the rectangle is " + x * y + " sq units");
  }

  void area(double x) {
    double z = 3.14 * x * x;
    System.out.println("the area of the circle is " + z + " sq units");
  }
}

class slip18a {
  public static void main(String args[]) {
    OverloadDemo ob = new OverloadDemo();
    ob.area(5);
    ob.area(11, 12);
    ob.area(2.5);
  }
}