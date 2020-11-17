package com.mysolution.task.model.entities.bases;

public abstract class Base {
    private float square;

    public float getSquare() {
        if (square == 0) {
            square = calculateSquare();
        }
        return square;
    }

    abstract float calculateSquare();
}