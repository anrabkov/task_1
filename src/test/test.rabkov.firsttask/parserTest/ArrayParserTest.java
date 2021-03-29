package parserTest;

import entity.ArrayEntity;
import exception.FileException;
import org.junit.Test;
import parser.ArrayParser;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class ArrayParserTest {
    ArrayParser arrayParser = new ArrayParser();

    @Test
    public void parseTest() throws FileException {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1, 4, 0, 01, 4, 0, 0");
        stringArrayList.add("2, 15, 8, 83");
        stringArrayList.add("4, O, 5, I, 7");

        ArrayEntity actualArrayEntity = arrayParser.parse(stringArrayList);
        int[] expectedArray = new int[]{1, 4, 0, 0, 2, 15, 8, 83};
        ArrayEntity expectedArrayEntity = new ArrayEntity(expectedArray);
        assertEquals(actualArrayEntity, expectedArrayEntity);
    }


}
