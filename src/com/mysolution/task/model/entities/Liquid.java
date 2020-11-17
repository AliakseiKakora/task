package com.mysolution.task.model.entities;

public enum Liquid {
    PETROL(740),
    KEROSENE(820),
    MACHINE_OIL(910);

    private int density;

    Liquid(int density) {
        this.density = density;
    }

    public int getDensity() {
        return density;
    }
}