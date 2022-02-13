/* Slip6_1 Write a java program to accept a number from user,
 if it zero then throw user defined Exception Number Is Zero, 
otherwise calculate the sum of first and last digit of that 
number. (Use static keyword).*/

import java.util.*;

class NumberZero extends RuntimeException {
	NumberZero() {
		super("Number is Zero");
	}
}
class slip6A {
	static void add_digit(int no) {
		int l = 0, f = 0;
		l = no % 10;
		if (no > 9) {
			while (no > 0) {
				f = no % 10;
				no = no / 10;
			}
		}
		System.out.println("Addition of first and last digit =" + (f + l));
	}

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");
		int no = s.nextInt();
		try {
			if (no == 0) {
				throw new NumberZero();
			} else
				add_digit(no);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}