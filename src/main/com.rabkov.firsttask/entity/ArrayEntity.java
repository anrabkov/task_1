package entity;

import java.util.Arrays;

public class ArrayEntity {

    private final int[] array;

    public ArrayEntity(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrayEntity entity = (ArrayEntity) o;
        return Arrays.equals(array, entity.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "array: {" + Arrays.toString(array) + '}';
    }
}