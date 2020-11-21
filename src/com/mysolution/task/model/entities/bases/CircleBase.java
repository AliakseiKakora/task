package com.mysolution.task.model.entities.bases;

public class CircleBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private static final String NAME = "Circle";
    private float radius;

    public CircleBase(float radius) {
        super(NAME);
        this.radius = radius;
    }

    @Override
    float calculateSquare() {
        return radius * radius * (float) Math.PI;
    }
}