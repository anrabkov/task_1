package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class ArraySortServiceStreamImplement implements ArraySortService {

    private static final ArrayValidator validator = new ArrayValidator();
    static Logger logger = LogManager.getLogger(ArraySortServiceStreamImplement.class);


    @Override
    public ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException {
        validator.validateToEmpty(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        logger.info("Array has sorted by bubbleSort successfully");
        return new ArrayEntity(array);
    }

    @Override
    public ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException {
        validator.validateToEmpty(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        logger.info("Array has sorted by mergeSort successfully");
        return new ArrayEntity(array);
    }

    @Override
    public ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException {
        validator.validateToEmpty(entity);
        int[] array = Arrays.stream(entity.getArray())
                .sorted().toArray();
        logger.info("Array has sorted by merge sort successfully");
        return new ArrayEntity(array);
    }
}
