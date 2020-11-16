package com.mysolution.task.entities.bases;

public class RectangularBase extends Base implements StraightContainerBase {
    private float lengthLargeSide;
    private float lengthLittleSide;

    private RectangularBase(float lengthLargeSide, float lengthLittleSide) {
        this.lengthLargeSide = lengthLargeSide;
        this.lengthLittleSide = lengthLittleSide;
    }

    @Override
    float calculateSquare() {
        return lengthLargeSide * lengthLittleSide;
    }
}