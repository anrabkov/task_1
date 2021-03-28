package parser;

import entity.ArrayEntity;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.Arrays.stream;

public class ArrayParser {

    private final Pattern pattern = Pattern.compile("(-?\\d+, )+-?\\d+");

    public ArrayEntity parse(List<String> list) {
        int[] array = list.stream().
                filter(line -> pattern.matcher(line).matches()).
                flatMap(line -> stream(line.split("\\s+"))).
                mapToInt(Integer::parseInt).
                toArray();
        return new ArrayEntity(array);
    }
}

