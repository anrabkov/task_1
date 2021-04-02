package test.rabkov.firsttask.checkerTest;

import com.rabkov.firsttask.checker.FirstCorrectStringChecker;
import com.rabkov.firsttask.exception.ArrayException;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstCorrectStringCheckerTest {

    private final FirstCorrectStringChecker checker = new FirstCorrectStringChecker();

    @Test
    public void checkingCorrectString() throws ArrayException {
        List<String> stringList = Arrays.asList("1 g 4", "14 47 -10", "-3, 7, 4");
        String expectedString = "14 47 -10";
        String actualString = checker.checkingCorrectString(stringList);

        Assert.assertEquals(actualString, expectedString);
    }

    @Test
    public void emptyListTest() {
        Assert.assertThrows(ArrayException.class,
                () -> checker.checkingCorrectString(new ArrayList<>()));
    }


}

