package com.rainmakeross.algorithms.problems.greedy;

import java.util.Arrays;

public class FirstLastInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,5,5,6,7,8,9};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(firstLastOccur(arr1, 5)));
        System.out.println(Arrays.toString(firstLastOccur(arr1, 7)));
        System.out.println(Arrays.toString(firstLastOccur(arr1, 900)));
        System.out.println(Arrays.toString(firstLastOccur(arr1, -900)));
    }

    private static int[] firstLastOccur(int[] arr, int value) {
        int low = 0;
        int high = arr.length-1;

        int discoveredIndex = -1;
        int firstIndex = -1;
        int lastIndex = -1;

        while(low< high) {
            int mid = (low+high)/2;
            if(arr[mid] == value) {
                discoveredIndex = mid;
                break;
            } else if(value < arr[mid]) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }

        if(discoveredIndex == -1)
            return new int[]{-1,-1};

        for(int i =0; i+discoveredIndex< arr.length;i++) {
            if(arr[i+discoveredIndex] == value)
                lastIndex = i+discoveredIndex;
        }

        for(int i =0; i+discoveredIndex>= 0;i--) {
            if(arr[i+discoveredIndex] == value)
                firstIndex = i+discoveredIndex;
        }

        return new int[]{firstIndex, lastIndex};
    }
}
