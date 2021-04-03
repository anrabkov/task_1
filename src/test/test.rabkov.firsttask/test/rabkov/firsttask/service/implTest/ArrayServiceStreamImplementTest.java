package test.rabkov.firsttask.service.implTest;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.service.ArrayService;
import com.rabkov.firsttask.service.impl.ArrayServiceImplement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayServiceStreamImplementTest {
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
    public void searchAverageValueOfArray() throws ArrayException {
        double actual = service.searchAverageValueOfArray(entity);
        double expected = 2.25;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchQuantityPositiveNumbersOfArray() throws ArrayException {
        int actual = service.searchQuantityPositiveNumbersOfArray(entity);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchQuantityNegativeNumbersOfArray() throws ArrayException {
        int actual = service.searchQuantityNegativeNumbersOfArray(entity);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void changeElementsOfArray() throws ArrayException {
        String actual = service.changeElementsOfArray(entity).toString();
        String expected = "array: {[5, 1, 3, 1]}";
        Assert.assertEquals(actual, expected);
    }
}
