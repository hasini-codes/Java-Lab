package q7;

import java.util.Scanner;

public class Q7 {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number to stop: ");
            int n = sc.nextInt();

            if (n < 0) break;

            System.out.println("Digits: " + countDigits(n));
        }
    }
}
