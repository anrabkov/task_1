package com.rabkov.firsttask.validator.fileValidator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StringListValidator {

    static Logger logger = LogManager.getLogger(StringListValidator.class);

    public boolean validateIsEmpty(List<String> list) {
        return list.isEmpty();
    }
}


