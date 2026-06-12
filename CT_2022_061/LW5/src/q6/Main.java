package q6;

import q4.Cat;
import q4.Dog;
import q4.Pet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Cat[] cats = new Cat[100];
        Dog[] dogs = new Dog[100];

        int petCount = 0;
        int catCount = 0;
        int dogCount = 0;

        while (true) {

            System.out.print("Enter Name (STOP to finish): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (c/d): ");
            char type = input.next().charAt(0);

            input.nextLine();

            if (type == 'c') {

                Cat cat = new Cat();

                cat.setName(name);

                System.out.print("Enter Coat Color: ");
                cat.setCoatColor(input.nextLine());

                pets[petCount++] = cat;

                cats[catCount++] = cat;

            }

            else if (type == 'd') {

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Enter Weight: ");
                dog.setWeight(input.nextDouble());

                input.nextLine();

                pets[petCount++] = dog;

                dogs[dogCount++] = dog;
            }
        }

        int choice;

        do {

            System.out.println("\nMENU");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");

            System.out.print("Enter Choice: ");

            choice = input.nextInt();

            input.nextLine();

            switch (choice) {

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Enter Cat Name: ");
                    cat.setName(input.nextLine());

                    System.out.print("Enter Coat Color: ");
                    cat.setCoatColor(input.nextLine());

                    pets[petCount++] = cat;

                    cats[catCount++] = cat;

                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Enter Dog Name: ");
                    dog.setName(input.nextLine());

                    System.out.print("Enter Weight: ");
                    dog.setWeight(input.nextDouble());

                    input.nextLine();

                    pets[petCount++] = dog;

                    dogs[dogCount++] = dog;

                    break;

                case 3:

                    System.out.print("Enter Cat Name to Remove: ");

                    String catName = input.nextLine();

                    for (int i = 0; i < catCount; i++) {

                        if (cats[i] != null &&
                                cats[i].getName().equalsIgnoreCase(catName)) {

                            for (int j = i; j < catCount - 1; j++) {
                                cats[j] = cats[j + 1];
                            }

                            cats[catCount - 1] = null;

                            catCount--;

                            break;
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter Dog Name to Remove: ");

                    String dogName = input.nextLine();

                    for (int i = 0; i < dogCount; i++) {

                        if (dogs[i] != null &&
                                dogs[i].getName().equalsIgnoreCase(dogName)) {

                            for (int j = i; j < dogCount - 1; j++) {
                                dogs[j] = dogs[j + 1];
                            }

                            dogs[dogCount - 1] = null;

                            dogCount--;

                            break;
                        }
                    }

                    break;

                case 0:

                    System.out.println("Program Ended");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        input.close();
    }
}
