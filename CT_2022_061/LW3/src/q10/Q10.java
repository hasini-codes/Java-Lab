package q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word/phrase: ");
        String input = sc.nextLine();

        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reverse = "";

        for (int i = clean.length() - 1; i >= 0;  i--) {
            reverse += clean.charAt(i);
        }

        if(clean.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
