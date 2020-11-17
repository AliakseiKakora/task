package com.mysolution.task.model.comparators;

import com.mysolution.task.model.entities.Container;

import java.util.Comparator;

public class MassComparator implements Comparator<Container> {
    @Override
    public int compare(Container o1, Container o2) {
        int result = 0;
        if (o1 == null || o2 == null) {
            result = 0;
        } else if (o1.getMass() > o2.getMass()) {
            result = 1;
        } else if (o1.getMass() < o2.getMass()) {
            result = -1;
        } else if (o1.getMass() == o2.getMass()) {
            result = 0;
        }
        return result;
    }
}