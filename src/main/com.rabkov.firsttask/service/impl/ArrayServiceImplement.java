package service.impl;

import entity.ArrayEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.ArrayService;
import exemptions.ArrayException;

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
    public double foundAverageValueOfArray(ArrayEntity entity) throws ArrayException {
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
    public int searchQuantityOfPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int searchQuantityOfNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int[] changeElementsOfArray(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
        int[] array = entity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
        }
        return array;
    }

    private void verificationArray(ArrayEntity entity) throws ArrayException {
        if (entity == null || entity.getArray().length == 0) {
            throw new ArrayException("The array is empty or equal to null");
        }
    }
}
