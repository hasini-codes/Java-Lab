package Q4;

public class Main {

    public static void main(String[] args) {

        Q4.Owner o1 = new Q4.Owner("Hasini", "0771234567");

        Q4.Bicycle b1 = new Q4.Bicycle(o1);

        System.out.println("Owner Name: " +
                b1.getOwner().getOwnerName());

        System.out.println("Phone Number: " +
                b1.getOwner().getPhoneNo());
    }
}