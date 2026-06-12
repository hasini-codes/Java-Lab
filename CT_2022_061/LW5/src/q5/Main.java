package q5;

import q4.Cat;
import q4.Dog;
import q4.Pet;

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

            count++;
        }

        Dog[] dogs = new Dog[100];

        int dogCount = 0;

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                dogs[dogCount] = (Dog) pets[i];

                dogCount++;
            }
        }

        if (dogCount > 0) {

            double total = 0;

            double min = dogs[0].getWeight();

            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {

                double weight = dogs[i].getWeight();

                total += weight;

                if (weight < min) {
                    min = weight;
                }

                if (weight > max) {
                    max = weight;
                }
            }

            double average = total / dogCount;

            System.out.println("\nDog Statistics");

            System.out.println("Average Weight = " + average);

            System.out.println("Minimum Weight = " + min);

            System.out.println("Maximum Weight = " + max);

        } else {

            System.out.println("No dogs found.");

        }

        input.close();
    }
}