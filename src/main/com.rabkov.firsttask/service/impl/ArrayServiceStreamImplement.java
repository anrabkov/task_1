package service.impl;

import entity.ArrayEntity;
import exception.ArrayException;

import java.util.Arrays;

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
    public double foundAverageValueOfArray(ArrayEntity entity) throws ArrayException {
        double average = Arrays.stream(entity.getArray()).
                average().
                orElseThrow(ArrayException::new);
        return average;
    }

    @Override
    public int searchQuantityOfPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException {
        return super.searchQuantityOfPositiveNumbersOfArray(entity);
    }

    @Override
    public int searchQuantityOfNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException {
        return super.searchQuantityOfNegativeNumbersOfArray(entity);
    }

    @Override
    public int[] changeElementsOfArray(ArrayEntity entity) throws ArrayException {
        return super.changeElementsOfArray(entity);
    }
}
