package com.rainmakeross.algorithms.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubArraysWithZeroSum {
    public static void main (String[] hodr) {
        int[] arr = {4,2,-3,-1,0,4};
        int[] arr2 = {3,4,-7,3,1,3,1,-4,-2,-2};
        int sum = 0;
        for(int[] a: naivePrintAllZeroSumPairs(arr, sum)){
            System.out.println(Arrays.toString(a));
        }

        for(int[] b: naivePrintAllZeroSumPairs(arr2, sum)){
            System.out.println(Arrays.toString(b));
        }
    }

    private static List<int[]> naivePrintAllZeroSumPairs(int[] arr, int sum) {
        List<int[]> listofArr = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int sumSoFar = arr[i];
            if(arr[i] ==sum) {
                listofArr.add(Arrays.copyOfRange(arr,i, i+1));
            }
            for(int j=i+1;j<arr.length;j++) {
                sumSoFar += arr[j];
                if(sumSoFar == sum)
                    listofArr.add(Arrays.copyOfRange(arr,i, j+1));
            }
        }

        return listofArr;
    }
}
