package be.intecbrussel.entities.plant_entities;

public class Plant {
    String name;
    double height;

    public Plant (String name) {

    }

    public Plant(String name, double height ) {

    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


