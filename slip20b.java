//Construct a Linked List containing name: CPP, Java, Python and PHP. Then extend your java program to do the following: i. Display the contents of the List using an Iterator ii. Display the contents of the List in reverse order using a ListIterator

import java.util.*;

class slip20b {

  public static void main(String[] args) {
    LinkedList t = new LinkedList();
    t.add("CPP");
    t.add("JAVA");
    t.add("Python");
    t.add("PHP");
    Iterator i = t.iterator();
    System.out.println("The Elements Are");
    while (i.hasNext())
      System.out.println(i.next());
    ListIterator i1 = t.listIterator();
    while (i1.hasNext())
      i1.next();
    System.out.println("The Elements In Reverse Order");
    while (i1.hasPrevious())
      System.out.println(i1.previous());
   
  }
}
