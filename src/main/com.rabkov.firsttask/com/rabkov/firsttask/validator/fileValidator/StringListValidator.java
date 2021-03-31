package com.rabkov.firsttask.validator.fileValidator;

import com.rabkov.firsttask.exception.FileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StringListValidator {

    static Logger logger = LogManager.getLogger(StringListValidator.class);

    public boolean validateStringList(List<String> list) throws FileException {
        if (list != null && !list.isEmpty()) {
            logger.info("String list was checked for null and for empty");
            return true;
        } else {
            throw new FileException("The string list is empty or equal to null");
        }
    }
}


