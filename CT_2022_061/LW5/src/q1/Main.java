package q1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Tommy");

        Cat cat = new Cat();
        cat.setName("Kitty");

        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Speak: " + dog.speak());

        System.out.println("Cat Name: " + cat.getName());
        System.out.println("Cat Speak: " + cat.speak());
    }
}