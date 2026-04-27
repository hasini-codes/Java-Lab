package Q9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length() - 1));
    }
}
