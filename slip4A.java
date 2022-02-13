//Write a java program to display alternate character from a given string.

import java.io.*;

class slip4A {
    static void printStringAlternate(String str) {
        int[] occ = new int[122];
        String s = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char temp = s.charAt(i);
            occ[temp]++;
            if (occ[temp] % 2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str1 = "Syed Nadeem Hussain";
        String str2 = "It is a long day Dear";
        printStringAlternate(str1);
        printStringAlternate(str2);
    }
}
