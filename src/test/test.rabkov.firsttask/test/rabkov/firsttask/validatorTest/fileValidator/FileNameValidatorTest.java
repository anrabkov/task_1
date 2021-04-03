package test.rabkov.firsttask.validatorTest.fileValidator;

import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.validator.fileValidator.FileNameValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileNameValidatorTest {
    private final FileNameValidator validator = new FileNameValidator();

    @Test
    public void fileNameEqualToNull() throws ArrayException {
        Assert.assertFalse(validator.validateFile(null));
    }

    @Test
    public void fileNotExistsTest() throws ArrayException {
        Assert.assertFalse(validator.validateFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile1.txt"));
    }

    @Test
    public void fileExistsTest() throws ArrayException {
        Assert.assertTrue(validator.validateFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile.txt"));
    }

    @Test
    public void fileIsEmpty() throws ArrayException {
        Assert.assertFalse(validator.validateFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\emptyFile.txt"));
    }

    @Test
    public void fileExistAndIsNotEmpty() throws ArrayException {
        Assert.assertTrue(validator.validateFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile.txt"));
    }

}
