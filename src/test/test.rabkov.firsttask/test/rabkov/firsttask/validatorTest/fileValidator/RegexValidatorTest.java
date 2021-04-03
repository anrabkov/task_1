package test.rabkov.firsttask.validatorTest.fileValidator;

import com.rabkov.firsttask.validator.fileValidator.RegexValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegexValidatorTest {
    private final RegexValidator validator = new RegexValidator();

    @Test
    public void equalsToRegex() {
        Assert.assertTrue(validator.validateRegex("1 34 -6"));
    }

    @Test
    public void notEqualsRegex() {
        Assert.assertFalse(validator.validateRegex("rt 24 4"));
    }
}


