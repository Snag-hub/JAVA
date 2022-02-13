//Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword)

import java.util.*;
public class slip3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int rem;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("No. is a Armstrong Number");
        } else {
            System.out.println("No. is not a Armstrong Number");
        }
    }
}