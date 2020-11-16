package com.mysolution.task.entities.bases;

public class SquareBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private float sideLength;

    public SquareBase(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    float calculateSquare() {
        return sideLength * sideLength;
    }
}