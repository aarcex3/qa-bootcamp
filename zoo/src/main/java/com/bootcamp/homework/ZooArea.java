package com.bootcamp.homework;

import java.util.ArrayList;

public class ZooArea {
    String name;
    int capacity;
    ArrayList<Animal> animals;

    public ZooArea(String zoneName, int capacity) {
        this.name = zoneName;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

    public void addAnimal(Animal animal) {
        if (this.animals.size() > this.capacity) {
            System.out.println("No se puede agragar mas animales");
        } else {
            this.animals.add(animal);
        }
    }

    public String getName() {

        return this.name;
    }

    public int getCapacity() {

        return this.capacity;
    }

}
