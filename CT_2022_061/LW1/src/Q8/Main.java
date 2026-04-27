package Q8;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int index = text.indexOf("!");

        String part1 = text.substring(0, index);
        String part2 = text.substring(index + 1);

        System.out.println(part1.trim());
        System.out.println(part2.trim());
    }
}


