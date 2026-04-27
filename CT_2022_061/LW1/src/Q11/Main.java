package Q11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner  input =new Scanner(System.in);

        String first = input.next();
        String middle = input.next();
        String last = input.next();

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
    }
}
