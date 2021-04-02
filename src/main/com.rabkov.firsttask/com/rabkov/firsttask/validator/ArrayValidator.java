package com.rabkov.firsttask.validator;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayValidator {
    static Logger logger = LogManager.getLogger(ArrayValidator.class);

    public boolean validateToNull(ArrayEntity entity) {
        return entity == null || entity.getArray().length == 0;
    }

    public void validateToEmpty(ArrayEntity entity) throws ArrayException {
        if (validateToNull(entity)) {
            logger.error("Entity is empty.");
            throw new ArrayException("Entity is empty");
        }
    }
}