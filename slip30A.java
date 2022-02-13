// Write a java program to accept a number from a user, if it is zero then throw user defined Exception Number is Zero. If it is non-numeric then generate an error Number is Invalid otherwise check whether it is palindrome or not.

import java.util.*;

class NumberIsZero extends RuntimeException {
    NumberIsZero() {
    }
}

class NumberInvalid extends RuntimeException {
    NumberInvalid() {
    }
}

class slip30A {

    public static void main(String args[]) {
        int result = 0, original, rem;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any no");
        int no = s.nextInt();
        if (no == 0) {
            throw new NumberIsZero();
        }
        if (no > 0) {
            original = no;
            while (no != 0) {
                rem = no % 10;
                result = (result * 10) + rem;
                no = no / 10;
            }
            if (original == result) {
                System.out.println("The given no is palindrome=" + original);
            } else {
                System.out.println("The given no is not palindrome=" + original);
            }
        } else {
            throw new NumberInvalid();
        }
    }
}