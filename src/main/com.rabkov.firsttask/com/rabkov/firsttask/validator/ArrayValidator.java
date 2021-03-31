package com.rabkov.firsttask.validator;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {

    static Logger logger = LogManager.getLogger(ArrayValidator.class);

    public boolean validate(ArrayEntity entity) throws ArrayException {
        int[] array = entity.getArray();
        if ((entity != null || array != null) && array.length > 0) {
            logger.info("The array was checked for null and for empty");
            return true;
        }
        throw new ArrayException();
//        } else {
//            if (entity.getArray() == null) throw new ArrayException("Array is equal to null");
//            if (array.length < 0) throw new ArrayException("Array is empty");
//            if (entity == null) throw new ArrayException("ArrayEntity == null");
//           throw new
    }
}
