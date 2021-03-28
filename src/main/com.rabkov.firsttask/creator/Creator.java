package creator;

import entity.ArrayEntity;
import exemptions.FileException;
import parser.ArrayParser;
import reader.ArrayReader;

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
