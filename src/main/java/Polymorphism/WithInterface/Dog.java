package Polymorphism.WithInterface;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
