package com.rainmakeross.algorithms.problems.greedy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9};
        Arrays.sort(arr);
        System.out.println(recursive(arr , 0, arr.length-1, 2) > -1);
        System.out.println(recursive(arr , 0, arr.length-1, 3) > -1);
        System.out.println(recursive(arr , 0, arr.length-1, 5) > -1);
        System.out.println(recursive(arr , 0, arr.length-1, 7) > 0);
        System.out.println(recursive(arr , 0, arr.length-1, 9) > 0);


        System.out.println(recursive(arr , 0, arr.length-1, 8) > 0);
        System.out.println(recursive(arr , 0, arr.length-1, 10) > 0);
        System.out.println(recursive(arr , 0, arr.length-1, 12) > 0);

    }

    private static int recursive(int[] arr, int low, int high,  int value) {
        int midPoint = (low+high)/2;
        if(low > high)
            return -1;

        if(value == arr[midPoint]) {
            return midPoint;
        } else if(value < arr[midPoint]) {
            return recursive(arr, low, midPoint -1, value);
        } else  {
            return recursive(arr, midPoint+1, high, value);
        }

    }
}
