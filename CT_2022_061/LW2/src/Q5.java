import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celcius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println("Celcius " + celcius);
    }
}
