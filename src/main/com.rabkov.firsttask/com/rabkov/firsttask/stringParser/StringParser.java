package com.rabkov.firsttask.stringParser;

import com.rabkov.firsttask.exception.FileException;
import com.rabkov.firsttask.validator.FileValidator;
import com.rabkov.firsttask.validator.fileValidator.RegexValidator;
import com.rabkov.firsttask.validator.fileValidator.StringValidator;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class StringParser {


    private static final StringValidator stringValidator = new StringValidator();
    private static final RegexValidator regexValidator = new RegexValidator();

    public List<Integer> parse(String string) throws FileException {
        stringValidator.validateString(string);
        List<Integer> listInteger = new ArrayList<>();
        regexValidator.validateRegex(string);
        String[] stringArray = string.split("\\s+");
        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            listInteger.add(number);
        }
        return listInteger;
    }
}



