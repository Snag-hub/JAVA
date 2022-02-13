/* Define an abstract class Shape with abstract methods area () and volume (). Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program to calculate area and volume of Cone and Cylinder.(Use Super Keyword.)*/

import java.util.*;

abstract class Shape {
    abstract public void area();
    abstract public void vol();
}
class Cone extends Shape {
    float r, s, h;
    Cone(float r, float s, float h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }
    public void area() {
        System.out.println("Area of Cone = " + (3.14 * r * s));
    }
    public void vol() {
        System.out.println("volume of Cone = " + (3.14 * r * r * h) / 3);
    }
}
class Cylinder extends Shape {
    float r, h;
    Cylinder(float r, float h) {
        this.r = r;
        this.h = h;
    }
    public void area() {
        System.out.println("Area of Cylinder = " + (2 * 3.14 * r * h));
    }
    public void vol() {
        System.out.println("volume of Cylinder	= " + (3.14 * r * r * h));
    }
}
class slip3B {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cone");
        float r = sc.nextFloat();
        System.out.println("Enter side of cone");
        float s1 = sc.nextFloat();
        System.out.println("Enter height of cone");
        float h = sc.nextFloat();
        Cone c1 = new Cone(r, s1, h);
        c1.area();
        c1.vol();
        System.out.println("Enter radius of cylinder");
        r = sc.nextFloat();
        System.out.println("Enter height of cylinder");
        h = sc.nextFloat();
        Cylinder c2 = new Cylinder(r, h);
        c2.area();
        c2.vol();

    }
}