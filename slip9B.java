
/* Write a java program to validate PAN number and Mobile Number. If it is invalid then throw user defined Exception Invalid Data, otherwise display it.*/

import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Invalidata extends RuntimeException {
    public Invalidata(String msg) {
        super(msg);
    }
}

class slip9B {
    static String pan_card = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
    static String mobile_no = "[6-9]{1}[0-9]{9}";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN number");
        String pan_no = sc.next();
        System.out.println("Enter Mobile number");
        String mobile_no = sc.next();
        ArrayList<String> a = new ArrayList<String>();
        a.add(pan_no); // add pan_no to list
        ArrayList<String> mob = new ArrayList<String>();
        mob.add(mobile_no); // add mobile_no to list
        for (String pancard : a) {
            Pattern p = Pattern.compile(pan_card);
            Matcher m = p.matcher(pancard);
            if (m.matches()) {
                System.out.println("PAN card is valid");
            } else {
                throw new Invalidata("PAN card is invalid");
            }
        }
        for (String mobno : mob) {
            Pattern p = Pattern.compile(mobile_no);
            Matcher m = p.matcher(mobno);
            if (m.matches()) {
                System.out.println("Mobile number is valid");
            } else {
                throw new Invalidata("Mobile number is invalid");
            }
        }
    }
}
