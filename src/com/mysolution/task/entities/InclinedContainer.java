package com.mysolution.task.entities;

import com.mysolution.task.entities.bases.CircleBase;
import com.mysolution.task.entities.bases.InclinedContainerBase;

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


    public static void main(String[] args) {
        CircleBase circleBase1 = new CircleBase(5);
        CircleBase circleBase2 = new CircleBase(7);
        InclinedContainer<CircleBase> circleContainer = new InclinedContainer<>(50, circleBase1, circleBase2);
        System.out.println(circleContainer.getVolume());
    }
}