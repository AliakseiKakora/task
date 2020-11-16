package com.mysolution.task.entities.bases;

public class OvalBase extends Base implements StraightContainerBase {
    private float lengthLargeAxis;
    private float lengthLittleAxis;

    public OvalBase(float lengthLargeAxis, float lengthLittleAxis) {
        this.lengthLargeAxis = lengthLargeAxis;
        this.lengthLittleAxis = lengthLittleAxis;
    }

    @Override
    float calculateSquare() {
        return  lengthLargeAxis * lengthLittleAxis * (float) Math.PI;
    }
}