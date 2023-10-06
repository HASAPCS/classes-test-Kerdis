package com.example;

public class Fruit {
    private String name;
    private String color;
    private String taste;
    private double weight;

    public Fruit(String name, String color, String taste, double weight) {
        // TODO: Initialize the attributes
        this.name = name;
        this.color = color; 
        this.taste = taste;
        this.weight = weight;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public String getName() {
        return name; 
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String newName) {
        this.name = newName; 
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTaste(String newTaste) {
        this.taste = newTaste;
    }

    public void setWeight(Double newWeight) {
        this.weight = newWeight;
    }
}
