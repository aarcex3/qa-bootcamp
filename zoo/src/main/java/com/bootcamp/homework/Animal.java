package com.bootcamp.homework;

public abstract class Animal implements IAnimal {
    String name;
    String breed;
    String specie;
    int birthYear;

    public Animal(String name, String breed, String specie, int birthYear) {
        this.name = name;
        this.breed = breed;
        this.specie = specie;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;

    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getSpecie() {
        return this.specie;
    }

}
