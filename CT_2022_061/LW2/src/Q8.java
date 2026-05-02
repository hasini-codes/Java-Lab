import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your radius: ");
        double r = sc.nextDouble();

        double volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);

        System.out.println("The volume of the sphere is " + volume);
    }
}
