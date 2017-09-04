package com.rainmakeross.algorithms.types.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsDifference {
    static int minimumAbsoluteDifferenceUnsorted(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(min > Math.abs(arr[i] - arr[j]))
                    min = Math.abs(arr[i] - arr[j]);
            }
        }

        return min;
    }

    static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min = Math.min(min, Math.abs(arr[i]-arr[i+1]));
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
