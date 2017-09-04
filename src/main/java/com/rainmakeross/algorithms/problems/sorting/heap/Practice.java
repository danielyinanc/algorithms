package com.rainmakeross.algorithms.problems.sorting.heap;

import java.util.Arrays;

/**
 * Implementation of Heap Sort Algorithm
 * from Pseudocode published on
 * Algorithms in a Nutshell 2nd Edition
 * Page 62
 */
public class Practice {
    public static void main(String[] args) {
        int[] inputArr = {-132,-50,-12,66,0,-12,89,100,450};
        sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }

    private static void sort(int[] A) {
        buildHeap(A);
        for(int i=A.length-1;i >0;i--){
            int tmp = A[0];
            A[0]= A[i];
            A[i] = tmp;
            heapify(A, 0 , i);
        }
    }

    private static void buildHeap(int[] A){
        for(int i=(A.length/2)-1; i>=0;i--) {
            heapify(A, i, A.length);
        }
    }

    private static void heapify(int[] A, int idx, int maxLength) {
        int largest = idx;
        int left = 2*idx + 1;
        int right = 2*idx +2;

        if(left < maxLength && A[left] > A[idx])
            largest = left;
        if(right < maxLength && A[right] > A[largest])
            largest = right;
        if(largest != idx) {
            int tmp = A[largest];
            A[largest] = A[idx];
            A[idx] = tmp;
            heapify(A, largest, maxLength);
        }
    }
}
