package com.mysolution.task.model.entities;

public abstract class Container {
    private float volume;
    private Liquid liquid;
    private final float height;
    private float mass;
    private final String type;

    public Container(String type, float height) {
        this.type = type;
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
        if (mass == 0) {
            mass = calculateMass();
        }
        return mass;
    }

    abstract float calculateVolume();

    private float calculateMass() {
        if (liquid == null) {
            return 0;
        }
        float maximumVolume = (float) 0.95;
        return  (getVolume() * maximumVolume * liquid.getDensity());
    }

    public void fillContainer(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return String.format("Container{" +
                ", volume=" + "%.2f" +
                ", height=" + "%.2f" +
                ", mass=" + "%.2f" +
                ", liquid=" + liquid +
                ", type=" + type +
                '}', volume, height, mass);
    }
}