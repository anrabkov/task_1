package test.rabkov.firsttask.parserTest;

import com.rabkov.firsttask.exception.FileException;
import org.junit.Test;
import com.rabkov.firsttask.stringParser.StringParser;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;



public class ArrayParserTest {
    private final StringParser stringParser = new StringParser();

    @Test
    public void parseTest() throws FileException {
        List<String> stringList = new ArrayList<>();
        stringList.add("1  4  0  0");
        stringList.add("g  15  50  47");
        stringList.add("14  47  -10  2");


        List<Integer> actualList = stringParser.parse("1 2 5");
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(5);

        Assert.assertEquals(actualList, expectedList);
    }


}
