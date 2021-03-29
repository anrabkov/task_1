package service.impl;

import entity.ArrayEntity;
import exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.ArraySortService;

public class ArraySortServiceImplementTest {
    private ArrayEntity entity;
    private ArraySortService service;

    @BeforeClass
    public void setUp() {
        entity = new ArrayEntity(1, 5, 2, 8);
        service = new ArraySortServiceImplement();
    }

    @Test
    public void bubbleSort() throws ArrayException {
        String actual = service.bubbleSort(entity).toString();
        String expected = "array: {[1, 2, 5, 8]}";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void insertionSort() throws ArrayException {
        String actual = service.insertionSort(entity).toString();
        String expected = "array: {[1, 2, 5, 8]}";

        Assert.assertEquals(actual, expected);
    }


}
