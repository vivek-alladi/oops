package Abstraction.AbstractClass;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lucy = new Dog("lucy");
        Animal skitty = new Cat("skitty");

        lucy.makeSound();
        skitty.makeSound();

    }
}
