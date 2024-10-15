package com.bootcamp.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola amiwis");

        String filePath = Main.class.getClassLoader().getResource("zoo.json").getPath();
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject data = new JSONObject(content);

            Zoo zoo = new Zoo("Zoo de los reales");

            JSONArray zonesArray = data.getJSONArray("zones");
            for (int i = 0; i < zonesArray.length(); i++) {
                JSONObject zone = zonesArray.getJSONObject(i);
                String zoneName = zone.getString("name");
                int capacity = zone.getInt("capacity");
                ZooArea area = new ZooArea(zoneName, capacity);
                zoo.addArea(area);
            }

            JSONArray animalsArray = data.getJSONArray("animals");
            for (int i = 0; i < animalsArray.length(); i++) {
                JSONObject animal = animalsArray.getJSONObject(i);
                String name = animal.getString("name");
                String breed = animal.getString("breed");
                String specie = animal.getString("specie");
                int birthYear = animal.getInt("birthYear");

                Animal animalObj;
                switch (specie.toLowerCase()) {
                case "dog":
                    animalObj = new Dog(specie, breed, name, birthYear);
                    break;
                case "cat":
                    animalObj = new Cat(specie, breed, name, birthYear);
                    break;
                case "horse":
                    animalObj = new Horse(specie, breed, name, birthYear);
                    break;
                default:
                    continue;
                }

                for (ZooArea area : zoo.getAreas()) {
                    area.addAnimal(animalObj);
                }
            }

            System.out.println("Zoologico: " + zoo.getName());
            System.out.println("Areas del zoologico:");
            for (ZooArea area : zoo.getAreas()) {
                System.out.println(
                        "Area: " + area.getName() + ". Capacidad: " + area.getCapacity() + ". Animales en la zona:");
                for (Animal animal : area.getAnimals()) {
                    System.out.println("\tNombre: " + animal.getName() + ". Especie: " + animal.getSpecie() + ". Raza: "
                            + animal.getBreed() + ". Fecha de nacimiento: " + animal.getBirthYear());
                }

            }

            System.out.println("Areas con menos de 3 animales:");
            List<ZooArea> filteredAreas = zoo.getAreas().stream().filter(zooArea -> zooArea.getAnimals().size() < 3)
                    .collect(Collectors.toList());

            for (ZooArea area : filteredAreas) {
                System.out.println("Area: " + area.getName());
                for (IAnimal animal : area.getAnimals()) {
                    System.out.println("\tNombre: " + animal.getName() + ". Especie: " + animal.getSpecie() + ". Raza: "
                            + animal.getBreed() + ". Fecha de nacimiento: " + animal.getBirthYear());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
