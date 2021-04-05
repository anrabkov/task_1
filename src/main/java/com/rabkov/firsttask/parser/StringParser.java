package com.rabkov.firsttask.parser;


import com.rabkov.firsttask.exception.ArrayException;

public class StringParser {
    private final static String SPACE_REGEX = "\\s+";

    public int[] parse(String string) throws ArrayException {
        if (string == null || string.isBlank()) {
            throw new ArrayException("Parsing line impossible");
        }
        String[] stringArray = string.split(SPACE_REGEX);
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            intArray[i] = number;
        }
        return intArray;
    }
}



