package com.mysolution.task.entities;

public abstract class Container {
    private float volume;
    private Liquid liquid;
    private float height;
    private float mass;

    public Container(float height) {
        this.height = height;
    }

    public float getVolume() {
        if (volume == 0) {
            volume = calculateVolume();
        }
        return volume;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public float getHeight() {
        return height;
    }

    public float getMass() {
        return mass;
    }

    abstract float calculateVolume();
}