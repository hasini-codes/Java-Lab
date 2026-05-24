package Q2;

import Q1.Temperature;
import java.util.Scanner;

public class Q2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();

        Temperature t = new Temperature();
        t.setFahrenheit(f);

        System.out.println("Celsius: " + t.toCelsius());
    }
}