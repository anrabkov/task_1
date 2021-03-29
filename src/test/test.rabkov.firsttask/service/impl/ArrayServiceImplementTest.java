package service.impl;

import entity.ArrayEntity;
import exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.ArrayService;

public class ArrayServiceImplementTest {

    private ArrayEntity entity;
    private ArrayService service;

    @BeforeClass
    public void setEntity() {
        entity = new ArrayEntity(5, 1, 3, 0);
        service = new ArrayServiceImplement();
    }

    @Test
    public void searchMinElementOfArray() throws ArrayException {
        int actual = service.searchMinElementOfArray(entity);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchMaxElementOfArray() throws ArrayException {
        int actual = service.searchMaxElementOfArray(entity);
        int expected = 5;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchSumOfArray() throws ArrayException {
        long actual = service.searchSumOfArray(entity);
        long expected = 9;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void foundAverageValueOfArray() throws ArrayException {
        double actual = service.foundAverageValueOfArray(entity);
        double expected = 2.25;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchQuantityOfPositiveNumbersOfArray() throws ArrayException {
        int actual = service.searchQuantityOfPositiveNumbersOfArray(entity);
        int expected = 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchQuantityOfNegativeNumbersOfArray() throws ArrayException {
        int actual = service.searchQuantityOfNegativeNumbersOfArray(entity);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void changeElementsOfArray() throws ArrayException {
        String actual = entity.toString();
        String expected = "array: {[5, 1, 3, 0]}";

        Assert.assertEquals(actual, expected);

    }
}
