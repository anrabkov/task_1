package com.rabkov.firsttask.creator;

import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.FileException;
import com.rabkov.firsttask.parser.ArrayParser;
import com.rabkov.firsttask.reader.ArrayReader;

import java.util.List;

public class Creator {
    ArrayReader reader;
    ArrayParser parser;

    public ArrayEntity createEntity(String fileName) throws FileException {
        List<String> arrayFromFile = reader.readFromFile(fileName);
        ArrayEntity entity = parser.parse(arrayFromFile);
        return entity;
    }
}
