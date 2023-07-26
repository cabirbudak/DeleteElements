package class_examples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int EqualizeArray(List<Integer> arr) {
        // Write your code here
        final int UPPER_LIMIT = 100;
        int[] intArray = new int[100];
        int maxCount = 0, lengthOfList = arr.size();
        for(int element : arr) {
            intArray[element-1] += 1;
        }
        for(int i = 0; i < UPPER_LIMIT; i++) {
            if(intArray[i] > maxCount)
                maxCount = intArray[i];
        }
        return lengthOfList - maxCount;
    }
}

