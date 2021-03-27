package service;

import entity.ArrayEntity;
import exemptions.ArrayException;

public interface ArrayService {
    public int searchMinElementOfArray(ArrayEntity entity) throws ArrayException;

    public int searchMaxElementOfArray(ArrayEntity entity) throws ArrayException;

    public long searchSumOfArray(ArrayEntity entity) throws ArrayException;

    public double foundAverageValueOfArray(ArrayEntity entity) throws ArrayException;

    public int searchQuantityOfPositiveNumbersOfArray(ArrayEntity entity) throws ArrayException;

    public int searchQuantityOfNegativeNumbersOfArray(ArrayEntity entity) throws ArrayException;

    public int[] changeElementsOfArray(ArrayEntity entity) throws ArrayException;


}
