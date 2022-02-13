
//Write a java program that asks the user name, and then greets the user by name. Before outputting the user's name, convert it to upper case letters. For example, if the user's name is Raj, then the program should respond "Hello, RAJ, nice to meet you!"
import java.util.*;

class slip13b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = sc.nextLine();
    System.out.println("Hello " + name.toUpperCase() + ", nice to meet you!");
  }
}
