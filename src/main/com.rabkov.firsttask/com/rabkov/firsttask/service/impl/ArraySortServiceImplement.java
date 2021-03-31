package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImplement implements ArraySortService {

    private static final ArrayValidator validator = new ArrayValidator();
    Logger logger = LogManager.getLogger(ArraySortServiceImplement.class);

    @Override
    public ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = entity.getArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        logger.info("Array has sorted by bubbleSort successfully");
        return new ArrayEntity(array);
    }


    @Override
    public ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException {
        validator.validate(entity);
        int[] array = entity.getArray();
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int position = i - 1;
            while (position >= 0 && array[position] > value) {
                array[position + 1] = array[position];
                position--;
            }
            array[position + 1] = value;
        }
        logger.info("Array has sorted by insertionSort successfully");

        return new ArrayEntity(array);
    }


    @Override
    public ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException {

        validator.validate(entity);
        int[] arrayToSort = entity.getArray();
        mergeSort(arrayToSort, arrayToSort.length);
        logger.info("Array has sorted by merge sort");
        return new ArrayEntity(arrayToSort);
    }

    private void mergeSort(int[] array, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int middle = arrayLength / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrayLength - middle];
        int k = 0;
        for (int i = 0; i < arrayLength; ++i) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[k] = array[i];
                k++;
            }
        }

        mergeSort(leftArray, middle);
        mergeSort(rightArray, arrayLength - middle);
        merge(leftArray, rightArray, array, middle, arrayLength - middle);
    }

    private void merge(int[] leftArray, int[] rightArray, int[] array, int leftLength, int rightLength) {
        int i = 0;
        int l = 0;
        int r = 0;
        while (l < leftLength && r < rightLength) {
            if (leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }
        while (l < leftLength) {
            array[i++] = leftArray[l++];
        }
        while (r < rightLength) {
            array[i++] = rightArray[r++];
        }
    }

}