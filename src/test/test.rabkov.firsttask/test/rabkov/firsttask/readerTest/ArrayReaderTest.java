package test.rabkov.firsttask.readerTest;

import com.rabkov.firsttask.exception.ArrayException;

import org.junit.Test;
import org.testng.Assert;
import com.rabkov.firsttask.reader.ArrayReader;


import java.util.Arrays;
import java.util.List;



public class ArrayReaderTest {

    private final ArrayReader reader = new ArrayReader();

    @Test
    public void fileNullTest() {
        Assert.assertThrows(ArrayException.class, () -> reader.readFromFile(null));
    }

    @Test
    public void fileNotFoundTest() {
        Assert.assertThrows(ArrayException.class,
                () -> reader.readFromFile("FileIsAbsent"));
    }


    @Test
    public void emptyFileTest() {
        Assert.assertThrows(ArrayException.class,
                () -> reader.readFromFile("emptyFile"));
    }


    @Test
    public void correctFileTest() throws ArrayException {
        List<String> expectedList = Arrays.asList("1 4 0 0", "14 47 -10 2");

        List<String> actualList = reader.readFromFile("correctFile");
        Assert.assertEquals(actualList, expectedList);
    }
}

