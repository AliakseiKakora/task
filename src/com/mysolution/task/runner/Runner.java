package com.mysolution.task.runner;

import com.mysolution.task.model.comparators.MassComparator;
import com.mysolution.task.model.entities.Container;
import com.mysolution.task.model.entities.Liquid;
import com.mysolution.task.model.entities.StraightContainer;
import com.mysolution.task.model.entities.bases.SquareBase;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SquareBase squareBase = new SquareBase(3);
        StraightContainer straightContainer = new StraightContainer(1, squareBase);
        straightContainer.fillContainer(Liquid.PETROL);
        System.out.println(straightContainer.getMass());
        SquareBase squareBase1 = new SquareBase(2);
        StraightContainer straightContainer1 = new StraightContainer(1, squareBase1);
        straightContainer1.fillContainer(Liquid.PETROL);
        System.out.println(straightContainer1.getMass());

        List<Container> containers = new ArrayList<>();
        containers.add(straightContainer);
        containers.add(straightContainer1);
        containers.sort(new MassComparator());

        for (Container container : containers) {
            System.out.println(container);
        }
    }
}
