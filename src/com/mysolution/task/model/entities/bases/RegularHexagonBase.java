package com.mysolution.task.model.entities.bases;

public class RegularHexagonBase extends Base implements InclinedContainerBase, StraightContainerBase {
    private float sideLength;

    public RegularHexagonBase(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    float calculateSquare() {
        return  sideLength * sideLength * (float) (Math.sqrt(27)/2);
    }
}