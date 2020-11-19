package com.mysolution.task.model.entities.bases;

public abstract class Base {
    private float square;
    private final String name;

    public Base(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getSquare() {
        if (square == 0) {
            square = calculateSquare();
        }
        return square;
    }

    abstract float calculateSquare();
}