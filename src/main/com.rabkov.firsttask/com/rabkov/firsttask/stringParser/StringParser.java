package com.rabkov.firsttask.stringParser;


import com.rabkov.firsttask.validator.fileValidator.RegexValidator;



public class StringParser {

    private static final RegexValidator regexValidator = new RegexValidator();
    private final static String SPACE_REGEX = "\\s+";


    public int[] parse(String string) {

        String[] stringArray = string.split(SPACE_REGEX);
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            intArray[i] = number;
        }
        return intArray;
    }
}



