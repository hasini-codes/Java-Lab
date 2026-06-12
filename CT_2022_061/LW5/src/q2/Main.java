package q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];

        int count = 0;

        while (true) {

            System.out.print("Enter Pet Name (STOP to finish): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (d = Dog, c = Cat): ");
            char type = input.next().charAt(0);
            input.nextLine();

            if (type == 'd') {

                pets[count] = new Dog();
                pets[count].setName(name);

            } else if (type == 'c') {

                pets[count] = new Cat();
                pets[count].setName(name);

            } else {

                System.out.println("Invalid Type!");
                continue;
            }

            count++;
        }

        System.out.println("\nPet List");

        for (int i = 0; i < count; i++) {

            System.out.print("Name: " + pets[i].getName());

            if (pets[i] instanceof Dog) {
                System.out.println(" | Type: Dog");
            } else {
                System.out.println(" | Type: Cat");
            }
        }

        input.close();
    }
}
