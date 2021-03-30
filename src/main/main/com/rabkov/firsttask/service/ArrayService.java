package com.rabkov.firsttask.service;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;

public interface ArrayService {
    public int searchMinElementOfArray(ArrayEntity entity) throws ArrayException;

    public int searchMaxElementOfArray(ArrayEntity entity) throws ArrayException;

    public long searchSumOfArray(ArrayEntity entity) throws ArrayException;

    public double searchAverageValueOfArray(ArrayEntity entity) throws ArrayException;

    public int searchQuantityPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException;

    public int searchQuantityNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException;

    public ArrayEntity changeElementsOfArray(ArrayEntity entity) throws ArrayException;


}
