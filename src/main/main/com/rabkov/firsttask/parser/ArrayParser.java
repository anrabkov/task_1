package com.rabkov.firsttask.parser;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.FileException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.Arrays.stream;

public class ArrayParser {

    final static String REGEX_FOR_VALIDATION = "-?\\d+";
    static Logger logger = LogManager.getLogger();
    private final Pattern pattern = Pattern.compile(REGEX_FOR_VALIDATION);

    public ArrayEntity parse(List<String> list) throws FileException {
        if (list == null) {
            logger.log(Level.INFO, "The list can't be equal to null");
            throw new FileException();
        }
        int[] array = list.stream()
                .filter(line -> pattern.matcher(line).matches())
                .flatMap(line -> stream(line.split("\\s+")))
                .mapToInt(Integer::parseInt)
                .toArray();
        return new ArrayEntity(array);
    }
}

