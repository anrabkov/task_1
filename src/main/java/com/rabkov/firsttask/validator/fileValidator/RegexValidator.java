package com.rabkov.firsttask.validator.fileValidator;

import java.util.regex.Pattern;

public class RegexValidator {

    public boolean validateRegex(String string) {
        Pattern pattern = Pattern.compile("^-?\\d+(\\s+(-?\\d+))*$");
        return pattern.matcher(string).matches();
    }
}
