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
                () -> reader.readFromFile("FileIsAbsent.txt"));
    }


    @Test
    public void emptyFileTest() {
        Assert.assertThrows(ArrayException.class,
                () -> reader.readFromFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\emptyFile.txt"));
    }


    @Test
    public void correctFileTest() throws ArrayException {
        List<String> expectedList = Arrays.asList("1 4 0 0", "g 15 50 47", "14 47 -10 -2");

        List<String> actualList = reader.readFromFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile.txt");
        Assert.assertEquals(actualList, expectedList);
    }
}

