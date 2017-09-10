package com.rainmakeross.algorithms.problems.arrays;

import java.util.Arrays;

public class FindPairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {8,7,2,5,3,1};
        int sum = 10;

        naiveSolution(arr, sum);
        sortedArraySolution(arr, sum);
    }

    private static void naiveSolution(int[] arr, int sum) {
        int indA =0;
        int indB = 0;
        boolean found = false;
        for(int i=0; i<arr.length;i++) {
            indA = i;
            int priorVal = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                if(priorVal+arr[j] == sum)
                    indB=j;
            }
            if(indB !=0) {
                found = true;
                break;
            }

        }

        if(found)
            System.out.println("Pair Found at index "+indA+ " and "+indB+ "("+arr[indA]+" + "+arr[indB]+")");
    }

    private static void sortedArraySolution(int[] arr, int sum) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        boolean found = false;
        while(low<high){
            if(arr[low] +arr[high] == sum) {
                System.out.println("Pair Found at index "+low+ " and "+high+ "("+arr[low]+" + "+arr[high]+")");
                return;
            }
            if(arr[low] +arr[high] < sum) {
                low++;
            } else {
                high--;
            }
        }
    }
}
