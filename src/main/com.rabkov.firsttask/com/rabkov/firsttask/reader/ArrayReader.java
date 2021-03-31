package com.rabkov.firsttask.reader;

import com.rabkov.firsttask.exception.FileException;
import com.rabkov.firsttask.validator.ArrayValidator;
import com.rabkov.firsttask.validator.FileValidator;
import com.rabkov.firsttask.validator.fileValidator.FileNameValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class ArrayReader {

    static Logger logger = LogManager.getLogger(ArrayReader.class);
    private static final FileNameValidator fileNameValidator = new FileNameValidator();

    public List<String> readFromFile(String fileName) throws FileException {

        fileNameValidator.validateFile(fileName);
        try {
            File file = new File(fileName);
            List<String> list = Files.readAllLines(file.toPath());
            return list;
        } catch (IOException e) {
            logger.info("Reading from {} was incorrect", fileName);
            throw new FileException(e);
        }
    }
}