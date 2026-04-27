package Q6;
import javax.swing.JFrame;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
        int w = input.nextInt();

        System.out.print("Height: ");
        int h=input.nextInt();

        input.nextLine();

        System.out.print("Title: ");
        String title = input.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(w,h);
        frame.setVisible(true);

    }
}

