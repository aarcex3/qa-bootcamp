package com.bootcamp.homework;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<ZooArea> areas;

    public Zoo(String name) {
        this.name = name;
        this.areas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ZooArea> getAreas() {
        return areas;
    }

    public void addArea(ZooArea area) {
        areas.add(area);
    }
}
