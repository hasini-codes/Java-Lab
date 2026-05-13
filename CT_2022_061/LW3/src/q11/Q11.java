package q11;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess number (1-100): ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Lower");
            } else if (guess < number) {
                System.out.println("Higher");
            }
        } while (guess < number);

        System.out.println("Correct!");
    }
}
