package com.rabkov.firsttask.creator;

import com.rabkov.firsttask.checker.FirstCorrectStringChecker;
import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.parser.StringParser;
import com.rabkov.firsttask.reader.ArrayReader;

import java.util.List;

public class Creator {
    private final ArrayReader reader = new ArrayReader();
    private final FirstCorrectStringChecker checker = new FirstCorrectStringChecker();
    private final StringParser parser = new StringParser();


    public ArrayEntity createEntity(String path) throws ArrayException {
        List<String> list = reader.readFromFile(path);
        String correctSting = checker.checkingCorrectString(list);
        int[] array = parser.parse(correctSting);
        return new ArrayEntity(array);
    }

}
