package Polymorphism.PolymorphicVariables;

//Objects of subclass can be assigned to parent class. This is possible because the subclass is gauranteed to have all
//methods and properties of parent class

public class Animal {
    public void makeSound(){
        System.out.println("this animal makes sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.makeSound();
        cat.makeSound();
    }
}