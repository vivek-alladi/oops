package Polymorphism.WithInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example with Interfaces");

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();
    }
}
