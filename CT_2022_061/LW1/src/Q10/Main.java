package Q10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        int mid = word.length() / 2;
        System.out.println(word.charAt(mid));
    }
}
