public class Q1 {
    public static void main(String[] args) {
        double A = 2, B = 3, C = 4;
        double X = 2, Y = 3;
        double r = 5;

        double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);

        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));

        double resultC = Math.cbrt(X * Y);

        double resultD = Math.PI * Math.pow(r, 2);

        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);
    }
}

