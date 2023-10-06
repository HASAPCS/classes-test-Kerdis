package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruitsList;

    public Basket(int capacity) {
        // TODO: Initialize the attributes (and initialize the fruits list)
        this.fruitsList = new ArrayList<Fruit>();
        this.capacity = capacity;
    }

    public void addFruit(Fruit fruit) {
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
        if (fruitsList.size() < capacity) {
            fruitsList.add(fruit);
        }
    }

    public void removeFruit(Fruit fruit) {
        // TODO: Remove the fruit from the basket
        fruitsList.remove(fruit);
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setFruits(ArrayList<Fruit> newFruits) {
        this.fruitsList = newFruits;
    }

    public ArrayList<Fruit> getFruits() {
        return fruitsList;
    }
    
    
}
