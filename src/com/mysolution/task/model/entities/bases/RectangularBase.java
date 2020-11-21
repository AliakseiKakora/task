package com.mysolution.task.model.entities.bases;

public class RectangularBase extends Base implements StraightContainerBase {
    private static final String NAME = "Rectangular";
    private float lengthLargeSide;
    private float lengthLittleSide;

    public RectangularBase(float lengthLargeSide, float lengthLittleSide) {
        super(NAME);
        this.lengthLargeSide = lengthLargeSide;
        this.lengthLittleSide = lengthLittleSide;
    }

    @Override
    float calculateSquare() {
        return lengthLargeSide * lengthLittleSide;
    }
}