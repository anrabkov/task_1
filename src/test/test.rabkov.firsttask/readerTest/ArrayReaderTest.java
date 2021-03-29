package readerTest;

import exception.FileException;
import org.junit.Test;
import org.testng.Assert;
import reader.ArrayReader;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class ArrayReaderTest {

    ArrayReader reader = new ArrayReader();

    @Test
    public void fileNameNullTest() {
        Assert.assertThrows(FileException.class, () -> reader.readFromFile(null));
    }

    @Test
    public void fileNotFoundTest() {
        assertThrows(FileException.class, () -> reader.readFromFile("notExitingFile"));
    }


    @Test
    public void emptyFileTest() {
        Assert.assertThrows(FileException.class, () -> reader.readFromFile("emptyFile"));
    }


    @Test
    public void correctFileTest() throws FileException {
        List<String> actual = new ArrayList<>();
        actual.add("1, 4, 0, 0");
        actual.add("g, 15, 50 , 47");
        actual.add("14, 47, -10, 2");

        Assert.assertEquals(reader.readFromFile(findPath("FileWithArrayLines")), actual);
    }

    private String findPath(String fileName) {
        return requireNonNull(ArrayReaderTest.class.getClassLoader().getResource(fileName)).getFile();
    }

}

