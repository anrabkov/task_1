package com.rabkov.firsttask.checker;

import com.rabkov.firsttask.exception.ArrayException;

import com.rabkov.firsttask.validator.fileValidator.RegexValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class FirstCorrectStringChecker {

    static Logger logger = LogManager.getLogger(FirstCorrectStringChecker.class);
    private final RegexValidator validator = new RegexValidator();

    public String checkingCorrectString(List<String> list) throws ArrayException {
        List<String> correctList = new ArrayList<>();
        for (String string : list) {
            if (validator.validateRegex(string)) {
                correctList.add(string);
            }
        }
        if (correctList.isEmpty()) {
            throw new ArrayException("The are no strings according to the pattern in the file");
        }
        String firstCorrectString = correctList.get(0);
        logger.info("First correct string has found: " + firstCorrectString);

        return firstCorrectString;
    }
}
