package test.rabkov.firsttask.validatorTest;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.validator.ArrayValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final ArrayValidator validator = new ArrayValidator();

    @Test
    public void equalsEntityToNull() {
        Assert.assertTrue(validator.validateToNull(null));
    }

    @Test
    public void equalsArrayToEmpty() {
        Assert.assertTrue(validator.validateToNull(new ArrayEntity()));
    }

    @Test
    public void equalsToCorrectEntity() {
        Assert.assertFalse(validator.validateToNull(new ArrayEntity(new int[]{1, 5, -44})));
    }

    @Test
    public void equalsToCorrectArray() {
        int[] array = new int[]{5};
        Assert.assertFalse(validator.validateToNull(new ArrayEntity(array)));
    }


}
