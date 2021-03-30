package com.rabkov.firsttask.service.impl;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.exception.ArrayException;

public class ArraySortServiceImplement implements ArraySortService {

    @Override
    public ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
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
        return new ArrayEntity(array);
    }


    @Override
    public ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);
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
        return new ArrayEntity(array);
    }


    @Override
    public ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException {
        verificationArray(entity);

        return null;
    }

    private void verificationArray(ArrayEntity entity) throws ArrayException {
        if (entity == null || entity.getArray().length == 0) {
            throw new ArrayException("The array is empty or equal to null");
        }
    }


}
