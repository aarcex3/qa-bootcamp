package com.bootcamp;

public abstract class Animal {
    String name;
    String species;
    String breed;

    public Animal(String name, String species, String breed) {
        this.name = name;
        this.species = species;
        this.breed = breed;
    }

    public abstract void makeSound();
}