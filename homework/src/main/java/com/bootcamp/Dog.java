package com.bootcamp;

// Martin's code
public class Dog extends Animal {
    public Dog(String name, String breed) {
        super(name, "Dog", breed);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}