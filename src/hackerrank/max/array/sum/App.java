package hackerrank.max.array.sum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {
    private final static int[] ARR1 = {3, 7, 4, 6, 5};
    private final static int[] ARR2 = {2, 1, 5, 8, 4};
    private final static int[] ARR3 = {3, 5, -7, 8, 10};

    public static void main(String[] args) {
//        System.out.println(maxSubsetSum((ARR1)));
//        System.out.println(maxSubsetSum((ARR2)));
        System.out.println(maxSubsetSum((ARR3)));
    }

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int maxSum = 0;
        int[] maxSubset = new int[]{};

        for (int i = 0; i < arr.length / 2; i++) {
//            for (int j = i; j < arr.length; j++) {
                List<Integer> subset = new ArrayList<>();

                int ind = 0;
                for (int k = i + ind, j = ind; k < arr.length && j < arr.length; k += 2 + j, j++) {
                    subset.add(arr[k]);
                }

                int subsetSum = subset.stream().reduce((a, b) -> a + b).orElse(0);
                if (subsetSum > maxSum) {
                    maxSum = subsetSum;
//                maxSubset = subset.toArray(new int[subset.size()]);
                }
//            }

        }

        return maxSum;
    }
}
