package q12;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("New word: ");
        String newWord = sc.nextLine();

        String result = sentence.replaceAll(oldWord,newWord);

        System.out.println("Updated sentence: " + result);

    }
}
