package com.mysolution.task.model.entities;

import com.mysolution.task.model.entities.bases.StraightContainerBase;

public class StraightContainer extends Container {
    private StraightContainerBase base;

    public StraightContainer(float height, StraightContainerBase base) {
        super(height);
        this.base = base;
    }

    @Override
    float calculateVolume() {
        return base.getSquare() * getHeight();
    }
}