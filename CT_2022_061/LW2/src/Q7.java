import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight(kg): ");
        int weight = sc.nextInt();

        System.out.print("Enter height(cm): ");
        int height = sc.nextInt();

        double BMI =weight / Math.pow(height /100.0, 2);

        System.out.println("Your BMI is: " + BMI);

        if(BMI >= 20 && BMI <= 25)
            System.out.println("Result: Normal");
        else
            System.out.println("Result: Not Normal");

    }
}
