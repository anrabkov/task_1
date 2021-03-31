package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.validator.ArrayValidator;

import java.util.Arrays;

public class ArrayServiceStreamImplement extends ArrayServiceImplement {

    private static final ArrayValidator validator = new ArrayValidator();

    @Override
    public int searchMinElementOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        return Arrays.stream(entity.getArray())
                .min()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public int searchMaxElementOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        return Arrays.stream(entity.getArray())
                .max()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public long searchSumOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        return Arrays.stream(entity.getArray())
                .sum();
    }

    @Override
    public double searchAverageValueOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        double average = Arrays.stream(entity.getArray()).
                average().
                orElseThrow(ArrayException::new);
        return average;
    }

    @Override
    public int searchQuantityPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        return (int) Arrays.stream(entity.getArray())
                .filter(s -> s > 0)
                .count();
    }

    @Override
    public int searchQuantityNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        return (int) Arrays.stream(entity.getArray())
                .filter(s -> s < 0)
                .count();
    }

    @Override
    public ArrayEntity changeElementsOfArray(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = Arrays.stream(entity.getArray())
                .filter(s -> s == 0)
                .map(s -> s = 1)
                .toArray();
        return new ArrayEntity(array);
    }
}
