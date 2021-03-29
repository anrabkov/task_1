package service;

import entity.ArrayEntity;
import exception.ArrayException;

public interface ArraySortService {
    ArrayEntity bubbleSort(ArrayEntity entity) throws ArrayException;

    ArrayEntity mergeSort(ArrayEntity entity) throws ArrayException;

    ArrayEntity insertionSort(ArrayEntity entity) throws ArrayException;


}
