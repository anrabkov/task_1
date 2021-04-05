package com.rabkov.firsttask.main;

import com.rabkov.firsttask.checker.FirstCorrectStringChecker;
import com.rabkov.firsttask.entity.ArrayEntity;
import com.rabkov.firsttask.exception.ArrayException;
import com.rabkov.firsttask.reader.ArrayReader;
import com.rabkov.firsttask.service.ArrayService;
import com.rabkov.firsttask.service.ArraySortService;
import com.rabkov.firsttask.service.impl.ArrayServiceImplement;
import com.rabkov.firsttask.parser.StringParser;
import com.rabkov.firsttask.service.impl.ArrayServiceStreamImplement;
import com.rabkov.firsttask.service.impl.ArraySortServiceImplement;
import com.rabkov.firsttask.service.impl.ArraySortServiceStreamImplement;


import java.util.List;

public class Main {
    public static void main(String[] args) throws ArrayException {
        ArrayServiceImplement arrayServiceImplement = new ArrayServiceImplement();
        ArrayServiceStreamImplement arrayServiceStreamImplement = new ArrayServiceStreamImplement();
        ArraySortServiceImplement arraySortServiceImplement = new ArraySortServiceImplement();
        ArraySortServiceStreamImplement arraySortServiceStreamImplement = new ArraySortServiceStreamImplement();

        ArrayReader reader = new ArrayReader();
        FirstCorrectStringChecker checker = new FirstCorrectStringChecker();
        StringParser parser = new StringParser();

        List<String> listFromFile = reader.readFromFile("C:\\Users\\Семья\\IdeaProjects\\firsttask\\src\\main\\resources\\files\\correctFile.txt");
        String correctString = checker.checkingCorrectString(listFromFile);
        int[] intArray = parser.parse(correctString);
        ArrayEntity entity = new ArrayEntity(intArray);

        arrayServiceImplement.searchAverageValueOfArray(entity);
        arrayServiceImplement.changeElementsOfArray(entity);
        arrayServiceImplement.searchMaxElementOfArray(entity);
        arrayServiceImplement.searchMinElementOfArray(entity);
        arrayServiceImplement.searchSumOfArray(entity);
        arrayServiceImplement.searchQuantityNegativeNumbersOfArray(entity);
        arrayServiceImplement.searchQuantityPositiveNumbersOfArray(entity);


        arrayServiceStreamImplement.searchAverageValueOfArray(entity);
        arrayServiceStreamImplement.changeElementsOfArray(entity);
        arrayServiceStreamImplement.searchMaxElementOfArray(entity);
        arrayServiceStreamImplement.searchMinElementOfArray(entity);
        arrayServiceStreamImplement.searchSumOfArray(entity);
        arrayServiceStreamImplement.searchQuantityNegativeNumbersOfArray(entity);
        arrayServiceStreamImplement.searchQuantityPositiveNumbersOfArray(entity);


        arraySortServiceImplement.bubbleSort(entity);
        arraySortServiceImplement.insertionSort(entity);
        arraySortServiceImplement.mergeSort(entity);

        arraySortServiceStreamImplement.bubbleSort(entity);
        arraySortServiceStreamImplement.insertionSort(entity);
        arraySortServiceStreamImplement.mergeSort(entity);
    }
}

