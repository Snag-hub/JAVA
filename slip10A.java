//Write a java program to count the frequency of each character in a given string.

public class slip10A {
    public static void main(String[] args) {
        String str = "Syed Nadeem Hussain";
        int[] freq = new int[str.length()];
        int i, j;

        char string[] = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}