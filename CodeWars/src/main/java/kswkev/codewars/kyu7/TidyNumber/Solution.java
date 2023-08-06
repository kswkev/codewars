package kswkev.codewars.kyu7.TidyNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static boolean tidyNumber(int numbers) {

        int copy = numbers;
        List<Integer> numberArray = new ArrayList<>();

        while (copy >= 10) {
            numberArray.add(copy % 10);
            copy /= 10;
        }
        numberArray.add(copy);

        Collections.sort(numberArray);

        int sortedNumber = 0;
        for (Integer number : numberArray) {
            sortedNumber *=10 ;
            sortedNumber += number;
        }

        return numbers == sortedNumber;

    }
}
