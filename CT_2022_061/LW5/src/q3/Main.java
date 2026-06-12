package q3;

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

            if (type == 'c') {
                pets[count] = new Cat();

            } else if (type == 'd') {
                pets[count] = new Dog();

            } else {
                System.out.println("Invalid Type");
                continue;
            }

            pets[count].setName(name);

            count++;
        }

        System.out.println("\nCats:");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
            }
        }

        System.out.println("\nDogs:");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }

        input.close();
    }
}