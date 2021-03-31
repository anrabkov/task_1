package com.rabkov.firsttask.stringParser;

import com.rabkov.firsttask.exception.FileException;
import com.rabkov.firsttask.validator.fileValidator.RegexValidator;


import java.util.ArrayList;
import java.util.List;


public class StringParser {

    private static final RegexValidator regexValidator = new RegexValidator();


    public int[] parse(String string) throws FileException {

        String[] stringArray = string.split("\\s+");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            intArray[i] = number;
        }
        return intArray;
    }
}



