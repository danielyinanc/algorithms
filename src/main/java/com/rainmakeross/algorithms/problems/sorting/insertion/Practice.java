package com.rainmakeross.algorithms.problems.sorting.insertion;

import java.util.Arrays;

/**
 * Implementation of Insertion Sort Algorithm
 * from Pseudocode published on
 * Algorithms in a Nutshell 2nd Edition
 * Page 57
 */
public class Practice {
    public static void main(String[] args) {
        int[] a = {1,4,13,25,11,1,-4,0,232,2352345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] A) {
        for(int i=0;i<A.length;i++) {
            insert(A, i, A[i]);
        }
    }

    private static void insert(int[] A, int pos, int value) {
        int i = pos -1;
        while (i>= 0 && A[i] > value) {
            A[i+1] = A[i];
            i=i-1;
            A[i+1] = value;
        }
    }
}
