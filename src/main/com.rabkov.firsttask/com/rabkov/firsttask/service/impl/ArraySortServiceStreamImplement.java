package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.validator.ArrayValidator;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class ArraySortServiceStreamImplement implements ArraySortService {

    ArrayValidator validator;

    @Override
    public ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        return new ArrayEntity(array);
    }

    @Override
    public ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        return new ArrayEntity(array);
    }

    @Override
    public ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        return new ArrayEntity(array);
    }
}
