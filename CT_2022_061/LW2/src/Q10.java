import java.util.Scanner;
import java.util.SequencedSet;

public class Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int MONTHS_IN_YEAR = 12;
        
        System.out.print("Loan amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualRate = sc.nextDouble();

        System.out.print("Loan period (years): ");
        int years = sc.nextInt();

        double monthlyInterestRate = annualRate / 100.0/ MONTHS_IN_YEAR;
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayment));

        double totalPaymnet = monthlyPayment * numberOfPayment;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPaymnet);
    }
}
