package com.mysolution.task.model.entities;

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
        return  (float) (getVolume() * 0.95 * liquid.getDensity());
    }

    public void fillContainer(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "Container{" +
                "volume=" + volume +
                ", liquid=" + liquid +
                ", height=" + height +
                ", mass=" + mass +
                '}';
    }
}