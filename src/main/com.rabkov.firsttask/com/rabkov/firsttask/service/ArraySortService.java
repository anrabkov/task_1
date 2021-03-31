package com.rabkov.firsttask.service;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;

public interface ArraySortService {
    ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException;

    ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException;

    ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException;


}
