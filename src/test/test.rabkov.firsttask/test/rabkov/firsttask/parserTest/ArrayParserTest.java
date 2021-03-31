package test.rabkov.firsttask.parserTest;

import com.rabkov.firsttask.exception.FileException;
import com.rabkov.firsttask.reader.ArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import com.rabkov.firsttask.stringParser.StringParser;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayParserTest {

    private final StringParser stringParser = new StringParser();
    static Logger logger = LogManager.getLogger(ArrayParserTest.class);


    @Test
    public void parseTest() throws FileException {
        String string = "1 5 8 2";
        int[] expectedArray = new int[]{1, 5, 8, 2};
        int[] actualArray = stringParser.parse(string);

        Assert.assertEquals(actualArray, expectedArray);
    }


}
