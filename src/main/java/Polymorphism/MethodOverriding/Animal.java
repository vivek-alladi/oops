package Polymorphism.MethodOverriding;

//Subclass provides its own implementation of a method that is already provided by parent class.
//This subclass to display specialised behaviour while adering to contract of superclass.

public class Animal {
    public void makeSound(){
        System.out.println("this animal makes sound");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
