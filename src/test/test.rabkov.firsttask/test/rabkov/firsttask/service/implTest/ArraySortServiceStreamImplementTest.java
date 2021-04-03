package test.rabkov.firsttask.service.implTest;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.service.impl.ArraySortServiceImplement;
import com.rabkov.firsttask.service.impl.ArraySortServiceStreamImplement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class ArraySortServiceStreamImplementTest {
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

    @Test
    void mergeSor() throws ArrayException {
        ArrayEntity newEntity = service.mergeSort(entity);
        int[] actualArray = newEntity.getArray();
        int[] expectedArray = new int[]{1, 2, 5, 8};
        Assert.assertEquals(actualArray, expectedArray);
    }

    @Test
    void bubbleNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.insertionSort(null));
    }

    @Test
    void insertionSortNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.insertionSort(null));
    }

    @Test
    void mergeNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.insertionSort(null));
    }

    @Test
    void bubbleSortEmptyArrayTest() {
        assertThrows(ArrayException.class, () -> service.bubbleSort(new ArrayEntity()));
    }

    @Test
    void insertSortEmptyArrayTest() {
        assertThrows(ArrayException.class, () -> service.insertionSort(new ArrayEntity()));
    }

    @Test
    void mergeSortEmptyArrayTest() {
        assertThrows(ArrayException.class, () -> service.mergeSort(new ArrayEntity()));
    }
}