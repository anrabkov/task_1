package test.rabkov.firsttask.parserTest;

import com.rabkov.firsttask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import com.rabkov.firsttask.parser.StringParser;
import org.testng.Assert;




public class ArrayParserTest {

    private final StringParser stringParser = new StringParser();
    static Logger logger = LogManager.getLogger(ArrayParserTest.class);


    @Test
    public void parseTest() throws ArrayException {
        String stringForParsing = "1 5 8 2";
        int[] expectedArray = new int[]{1, 5, 8, 2};
        int[] actualArray = stringParser.parse(stringForParsing);

        Assert.assertEquals(actualArray, expectedArray);
    }

    @Test
    public void StringToNullTest() {

        Assert.assertThrows(ArrayException.class, () -> stringParser.parse(null));
    }


}
