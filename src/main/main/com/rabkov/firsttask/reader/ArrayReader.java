package com.rabkov.firsttask.reader;

import com.rabkov.firsttask.exception.FileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArrayReader {
    static Logger logger = LogManager.getLogger(ArrayReader.class);

    public List<String> readFromFile(String fileName) throws FileException {
        if (fileName == null) {
            logger.error("fileName can not be equal to null");
            throw new FileException();
        }
        File file = new File(fileName);
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        } catch (IOException e) {
            logger.error("Read from the file fails.", file, e.getCause());
            throw new FileException(e);
        }
        if (list.isEmpty()) {
            logger.error("List is empty", file);
            throw new FileException();
        }

        return list;
    }
}