/*Slip24_2Create a package TYBBACA with two classes as class Student (Rno, SName, Per) with a method disp() to display details of N Students and class Teacher (TID, TName, Subject) with a method disp() to display the details of teacher who is teaching Java subject. (Make use of finalize() method and array of Object)*/

import TYBBACA.Student;
import TYBBACA.Teacher;

class Slip24b {
  public static void main(String args[]) {
    Student s = new Student();
    s.getData();
    s.disp();
    Teacher t = new Teacher();
    t.getData();
    t.disp();

  }

}