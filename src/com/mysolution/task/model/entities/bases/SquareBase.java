package com.mysolution.task.model.entities.bases;

public class SquareBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private static final String NAME = "Square";
    private float sideLength;

    public SquareBase(float sideLength) {
        super(NAME);
        this.sideLength = sideLength;
    }

    @Override
    float calculateSquare() {
        return sideLength * sideLength;
    }
}