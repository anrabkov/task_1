package com.rabkov.firsttask.reader;

import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.validator.fileValidator.FileNameValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayReader {

    static Logger logger = LogManager.getLogger(ArrayReader.class);
    private static final FileNameValidator fileNameValidator = new FileNameValidator();

    public List<String> readFromFile(String path) throws ArrayException {

        if (!fileNameValidator.validateFile(path)) {
            logger.info("Reading from the file impossible");
            throw new ArrayException("Reading from the file impossible");
        }

        List<String> list = new ArrayList<>();
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (IOException e) {
            logger.info("Reading from the file impossible");
            throw new ArrayException(e);
        }
        logger.info("The file has read successfully and you have a new  string array list");
        return list;
    }
}