package test.rabkov.firsttask.readerTest;

import com.rabkov.firsttask.exception.FileException;
import org.junit.Test;
import org.testng.Assert;
import com.rabkov.firsttask.reader.ArrayReader;


import java.util.Arrays;
import java.util.List;



public class ArrayReaderTest {

    private final ArrayReader reader = new ArrayReader();

    @Test
    public void fileNullTest() {
        Assert.assertThrows(FileException.class,
                () -> reader.readFromFile(null));
    }

    @Test
    public void fileNotFoundTest() {
        Assert.assertThrows(FileException.class,
                () -> reader.readFromFile("FileIsAbsent"));
    }


    @Test
    public void emptyFileTest() {
        Assert.assertThrows(FileException.class,
                () -> reader.readFromFile("emptyFile"));
    }


    @Test
    public void correctFileTest() throws FileException {
        List<String> expectedList = Arrays.asList("1 4 0 0", "14 47 -10 2");

        List<String> actualList = reader.readFromFile("correctFile");
        Assert.assertEquals(actualList, expectedList);
    }
}

