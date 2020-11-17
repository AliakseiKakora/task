package com.mysolution.task.model.entities;

import com.mysolution.task.model.entities.bases.InclinedContainerBase;

public class InclinedContainer<T extends InclinedContainerBase> extends Container {
    private T largeBase;
    private T littleBase;

    public InclinedContainer(float height, T largeBase, T littleBase) {
        super(height);
        this.largeBase = largeBase;
        this.littleBase = littleBase;
    }

    @Override
    float calculateVolume() {
        return  (largeBase.getSquare() + ((float) Math.sqrt(largeBase.getSquare()
                * littleBase.getSquare()) + littleBase.getSquare())) * getHeight() / 3;
    }
}