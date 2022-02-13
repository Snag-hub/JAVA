/* Write a java program to accept a number from user, If it is greater than 1000 then throw user defined exception Number is out of Range otherwise display the factors of that number. (Use static keyword) */

import java.util.*;

class OutOfRangeNo extends RuntimeException {
    OutOfRangeNo(String msg) {
        super(msg);
    }
}

class slip27A {
    static int no;

    public static void main(String args[]) {

        int fact = 0;// local variable
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any no");
        no = s.nextInt();
        try {
            if (no > 1000) {
                throw new OutOfRangeNo("Number is out of Range");

            } else {
                for (int i = 1; i <= no; i++) {
                    if (no % i == 0) {

                        System.out.println("Factors of given no=" + i);
                    }

                }

            }
        } // try ended
        catch (Exception e) {
            System.out.println(e);

            System.out.println("No Out of Range");
        }
    }

}