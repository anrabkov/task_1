package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.service.ArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.rabkov.firsttask.exception.ArrayException;

public class ArrayServiceImplement implements ArrayService {

    static Logger logger = LogManager.getLogger();

    @Override
    public int searchMinElementOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        logger.log(Level.INFO, "Minimum array element = " + min);
        return min;
    }

    @Override
    public int searchMaxElementOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        logger.log(Level.INFO, "Maximum array element = " + max);
        return max;
    }

    @Override
    public long searchSumOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        logger.log(Level.INFO, "The sum of the array elements = " + sum);
        return sum;
    }

    @Override
    public double searchAverageValueOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum * 1.0 / array.length;
        logger.log(Level.INFO, "The average value of array elements = " + average);
        return average;
    }

    @Override
    public int searchQuantityPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                quantity++;
            }
        }
        logger.log(Level.INFO, "Number of positive array elements  = " + quantity);
        return quantity;
    }

    @Override
    public int searchQuantityNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                quantity++;
            }
        }
        logger.log(Level.INFO, "Number of negative array elements  = " + quantity);
        return quantity;
    }

    @Override
    public ArrayEntity changeElementsOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
        }
        logger.log(Level.INFO, "Array elements equal to 0 have been replaced " +
                "with an element equal to 1");
        return new ArrayEntity(array);
    }

    private boolean verificationArray(ArrayEntity entity) throws ArrayException {
        return entity == null || entity.getArray().length == 0;
    }
}
