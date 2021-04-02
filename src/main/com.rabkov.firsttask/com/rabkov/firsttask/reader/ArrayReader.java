package com.rabkov.firsttask.reader;

import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.validator.fileValidator.FileNameValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class ArrayReader {

    static Logger logger = LogManager.getLogger(ArrayReader.class);
    private static final FileNameValidator fileNameValidator = new FileNameValidator();

    public List<String> readFromFile(String fileName) throws ArrayException {

        if (!fileNameValidator.validateFile(fileName)) {
            logger.info("Reading from the file \"" + fileName + "\" is not possible");
            throw new ArrayException("Reading from the file \"" + fileName + "\" is not possible");
        }
        try {
            File file = new File(fileName);
            List<String> list = Files.readAllLines(file.toPath());
            return list;
        } catch (IOException e) {
            logger.info("Reading from the file \"" + fileName + "\" is not possible");
            throw new ArrayException(e);

        }
    }
}