package test.rabkov.firsttask.readerTest;

import com.rabkov.firsttask.exception.FileException;
import org.junit.Test;
import org.testng.Assert;
import com.rabkov.firsttask.reader.ArrayReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

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
                () -> reader.readFromFile("notExitingFile"));
    }


    @Test
    public void emptyFileTest() {
        Assert.assertThrows(FileException.class,
                () -> reader.readFromFile("emptyFile"));
    }


//    @Test
//    public void correctFileTest() throws FileException, IOException {
//        List<String> expected = new ArrayList<>();
//        expected.add("1, 4, 0, 0");
//        expected.add("g, 15, 50 , 47");
//        expected.add("14, 47, -10, 2");
//        List<String> actual = reader.readFromFile("Array");
//
//        Assert.assertEquals(actual, expected);
//    }

    @Test
    public void correctFileTest() throws FileException {
        List<String> expected = new ArrayList<>();
        expected.add("1 4 0 0");
        expected.add("g 15 50  47");
        expected.add("14 47 -10 2");

        List<String> actual = reader.readFromFile("array");
        assertEquals(actual, expected);
    }
}

