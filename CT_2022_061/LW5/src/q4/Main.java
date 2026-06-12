package q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];

        int count = 0;

        while (true) {

            System.out.print("Enter Name (STOP to finish): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (c = Cat, d = Dog): ");
            char type = input.next().charAt(0);
            input.nextLine();

            if (type == 'c') {

                Cat cat = new Cat();

                cat.setName(name);

                System.out.print("Enter Coat Color: ");
                cat.setCoatColor(input.nextLine());

                pets[count] = cat;

            }

            else if (type == 'd') {

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Enter Weight: ");
                dog.setWeight(input.nextDouble());

                input.nextLine();

                pets[count] = dog;

            }

            else {

                System.out.println("Invalid Type");
                continue;

            }

            count++;
        }

        System.out.println("\nCats");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {

                Cat cat = (Cat) pets[i];

                System.out.println(
                        "Name: " + cat.getName()
                                + " | Type: Cat"
                                + " | Coat Color: "
                                + cat.getCoatColor());
            }
        }

        System.out.println("\nDogs");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                Dog dog = (Dog) pets[i];

                System.out.println(
                        "Name: " + dog.getName()
                                + " | Type: Dog"
                                + " | Weight: "
                                + dog.getWeight());
            }
        }

        input.close();
    }
}
