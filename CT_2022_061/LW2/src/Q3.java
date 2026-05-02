import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
