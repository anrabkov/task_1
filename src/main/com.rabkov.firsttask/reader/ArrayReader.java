package reader;

import exception.FileException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class ArrayReader {
    public List<String> readFromFile(String fileName) throws FileException {
        File file = new File(fileName);
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new FileException(e);
        }
        if (list.isEmpty()) {
            throw new FileException("File is empty");
        }
        return list;
    }
}