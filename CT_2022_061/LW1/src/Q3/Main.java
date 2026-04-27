package Q3;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String middle = input.nextLine();
        String last = input.nextLine();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }

}
