package Q3;

import java.util.Scanner;

public class Q3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        Q3.Circle inner = new Q3.Circle(ri);
        Q3.Circle outer = new Q3.Circle(ro);

        double area = outer.computeArea() - inner.computeArea();

        System.out.println("Circular Region Area: " + area);
    }
}