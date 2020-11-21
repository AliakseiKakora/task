package com.mysolution.task.model.entities.bases;

public class IsoscelesTrapezoidBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private static final String NAME = "Trapezoid";
    private float lengthLargerBase;
    private float lengthLittleBase;
    private float height;

    public IsoscelesTrapezoidBase(float lengthLargerBase, float lengthLittleBase, float height) {
        super(NAME);
        this.lengthLargerBase = lengthLargerBase;
        this.lengthLittleBase = lengthLittleBase;
        this.height = height;
    }

    @Override
    float calculateSquare() {
        return (lengthLargerBase + lengthLittleBase) * height / 2;
    }
}