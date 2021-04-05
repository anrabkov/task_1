package test.rabkov.firsttask.creator;

import com.rabkov.firsttask.creator.Creator;
import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CreatorTest {
    private final Creator creator = new Creator();

    @Test
    public void createCorrectEntity() throws ArrayException {
        ArrayEntity expectedArrayEntity = new ArrayEntity(1, 4, 0, 0);
        ArrayEntity actualArrayEntity = creator.createEntity("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile.txt");
        Assert.assertEquals(actualArrayEntity, expectedArrayEntity);
    }


}
