package com.mysolution.task.model.entities.bases;

public class SquareBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private float sideLength;

    public SquareBase(float sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    float calculateSquare() {
        return sideLength * sideLength;
    }
}