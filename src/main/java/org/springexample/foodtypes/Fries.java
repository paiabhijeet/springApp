package org.springexample.foodtypes;

public abstract class Fries {

    private String name;

    abstract void printMessage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
