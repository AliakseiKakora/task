package com.mysolution.task.runner;

import com.mysolution.task.model.comparators.MassComparator;
import com.mysolution.task.model.entities.*;
import com.mysolution.task.model.entities.bases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
    In this example, all numbers are measured in meters.
 */
public class Runner {

    public static void main(String[] args) {
        SquareBase squareBase = new SquareBase(3);
        StraightContainer straightContainerSquareBase = new StraightContainer(1, squareBase);
        straightContainerSquareBase.fillContainer(Liquid.PETROL);

        RectangularBase rectangularBase = new RectangularBase(0.3f, 0.6f);
        StraightContainer straightContainerRectangularBase = new StraightContainer(1, rectangularBase);
        straightContainerRectangularBase.fillContainer(Liquid.KEROSENE);

        CircleBase circleBase = new CircleBase(0.7f);
        StraightContainer straightContainerCircleBase = new StraightContainer(1, circleBase);
        straightContainerCircleBase.fillContainer(Liquid.MACHINE_OIL);

        IsoscelesTrapezoidBase trapezoidBase = new IsoscelesTrapezoidBase(0.7f, 0.5f, 1);
        StraightContainer straightContainerTrapezoidBase = new StraightContainer(1, trapezoidBase);
        straightContainerTrapezoidBase.fillContainer(Liquid.PETROL);

        OvalBase ovalBase = new OvalBase(0.45f, 0.35f);
        StraightContainer straightContainerOvalBase = new StraightContainer(1, ovalBase);
        straightContainerOvalBase.fillContainer(Liquid.KEROSENE);

        RegularHexagonBase hexagonBase = new RegularHexagonBase(1.2f);
        StraightContainer straightContainerHexagonBase = new StraightContainer(1, hexagonBase);
        straightContainerHexagonBase.fillContainer(Liquid.MACHINE_OIL);

        SquareBase largeSquareBase = new SquareBase(2);
        SquareBase littleSquareBase = new SquareBase(1);
        InclinedContainer<SquareBase> inclinedContainerSquareBase = new InclinedContainer<>(1, largeSquareBase, littleSquareBase);
        inclinedContainerSquareBase.fillContainer(Liquid.PETROL);

        CircleBase largeCircleBase = new CircleBase(1);
        CircleBase littleCircleBase = new CircleBase(0.8f);
        InclinedContainer<CircleBase> inclinedContainerCircleBase = new InclinedContainer<>(1, largeCircleBase, littleCircleBase);
        inclinedContainerCircleBase.fillContainer(Liquid.KEROSENE);

        IsoscelesTrapezoidBase largeTrapezoidBase = new IsoscelesTrapezoidBase(1, 0.8f, 0.3f);
        IsoscelesTrapezoidBase littleTrapezoidBase = new IsoscelesTrapezoidBase(0.5f, 0.3f, 0.2f);
        InclinedContainer<IsoscelesTrapezoidBase> inclinedContainerTrapezoidBase = new InclinedContainer<>(1, largeTrapezoidBase, littleTrapezoidBase);
        inclinedContainerTrapezoidBase.fillContainer(Liquid.MACHINE_OIL);

        RegularHexagonBase largeRegularHexagonBase = new RegularHexagonBase(2);
        RegularHexagonBase littleRegularHexagonBase = new RegularHexagonBase(1);
        InclinedContainer<RegularHexagonBase> inclinedContainerHexagonBase = new InclinedContainer<>(1, largeRegularHexagonBase, littleRegularHexagonBase);
        inclinedContainerHexagonBase.fillContainer(Liquid.PETROL);

        List<Container> containers = new ArrayList<>();
        containers.add(straightContainerSquareBase);
        containers.add(straightContainerRectangularBase);
        containers.add(straightContainerCircleBase);
        containers.add(straightContainerTrapezoidBase);
        containers.add(straightContainerHexagonBase);
        containers.add(straightContainerOvalBase);
        containers.add(inclinedContainerCircleBase);
        containers.add(inclinedContainerHexagonBase);
        containers.add(inclinedContainerSquareBase);
        containers.add(inclinedContainerTrapezoidBase);

        containers.sort(new MassComparator());
        containers.forEach(System.out::println);

        System.out.println("----------------------------------------");

        Optional<Container> optional = containers.stream().filter(a -> a.getLiquid() == Liquid.KEROSENE).
                max((o1, o2) -> (int) (o1.getMass() - o2.getMass()));
        if (optional.isPresent()) {
            float maxMassKerosene = optional.get().getMass();
            System.out.printf("Maximum mass of kerosene - %.2f kg.", maxMassKerosene);
        }
    }
}