package Q1;

import java.util.Scanner;

public class Q1Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        Q1.Temperature t = new Q1.Temperature(c);

        System.out.println("Fahrenheit: " + t.toFahrenheit());
    }
}
