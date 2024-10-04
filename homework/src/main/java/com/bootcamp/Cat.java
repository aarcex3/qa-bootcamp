package com.bootcamp;

public class Cat extends Animal {
    public Cat(String name, String breed) {
        super(name, "Cat", breed);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}
