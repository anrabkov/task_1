package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ArrayServiceStreamImplement extends ArrayServiceImplement {

    @Override
    public int searchMinElementOfArray(ArrayEntity entity) throws ArrayException {
        return Arrays.stream(entity.getArray())
                .min()
                .orElseThrow(ArrayException::new);

    }

    @Override
    public int searchMaxElementOfArray(ArrayEntity entity) throws ArrayException {
        return Arrays.stream(entity.getArray())
                .max()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public long searchSumOfArray(ArrayEntity entity) throws ArrayException {
        return Arrays.stream(entity.getArray())
                .sum();
    }

    @Override
    public double searchAverageValueOfArray(ArrayEntity entity) throws ArrayException {
        double average = Arrays.stream(entity.getArray()).
                average().
                orElseThrow(ArrayException::new);
        return average;
    }

    @Override
    public int searchQuantityPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException {
        return (int) Arrays.stream(entity.getArray())
                .filter(n -> n > 0)
                .count();
    }

    @Override
    public int searchQuantityNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException {
        return (int) Arrays.stream(entity.getArray())
                .filter(n -> n < 0)
                .count();
    }

    @Override
    public ArrayEntity changeElementsOfArray(ArrayEntity entity) throws ArrayException {
        int[] array = Arrays.stream(entity.getArray())
                .filter(n -> n == 0)
                .map(n -> n = 1)
                .toArray();
        return new ArrayEntity(array);
    }
}
