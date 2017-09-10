package com.rainmakeross.algorithms.problems.divideandconquer.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Recursive Quick Sort Algorithm Implementation
 * Assumptions:
 * 1. Input array is populated by unique signed integers
 *
 * Pseudo Code:
 * - Pick a Random midPoint from input list
 * - Divide remaining members in the array to lesser and greater list
 * - Apply the same logic to each generated list (lesser and greater)
 * - Add recursive returns of lesser list left of midpoint and recursive returns of greater list to right of midpoint
 */
public class RecursiveQuickSort {
    private static Random random = new Random();
    private static Integer operationCount=0;
    public static void main(String[] args) {
        List<Integer> unsortedL = new ArrayList<>();
        unsortedL.add(0);
        unsortedL.add(5);
        unsortedL.add(10);
        unsortedL.add(Integer.MIN_VALUE);
        unsortedL.add(3);
        unsortedL.add(20);
        unsortedL.add(1);
        unsortedL.add(Integer.MAX_VALUE);
        System.out.println(recursiveQuickSort(unsortedL)+ "in "+ operationCount+" operations.");
    }

    private static List<Integer> recursiveQuickSort(List<Integer> unsortedList) {

        if(unsortedList.size() <= 1)
            return unsortedList;

        List<Integer> retList = new ArrayList<>();
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        Integer midPoint = unsortedList.get(
                random.nextInt(unsortedList.size()));
        int count = 1;
        for(Integer value: unsortedList) {
            operationCount++;
            if( value.equals(midPoint)) {
                //continue;
            } else if(value < midPoint) {
                lesser.add(value);
            } else {
                greater.add(value);
            }
        }

        retList.addAll(recursiveQuickSort(lesser));
        for(int i=0;i<count;i++) {
            retList.add(midPoint);
        }
        retList.addAll(recursiveQuickSort(greater));

        return retList;
    }
}
