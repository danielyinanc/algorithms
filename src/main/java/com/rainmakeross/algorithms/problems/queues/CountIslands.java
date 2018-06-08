package com.rainmakeross.algorithms.problems.queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Pseudocode
 * 1. Go through the matrix
 *  - When found a 1, check if it is processed,
 *  - if not, run BFS to process the entire island by adding them to processed
 *  - increase island count by 1
 * 2. Return island count
 */
public class CountIslands {
    public static void main(String[] args) {
        Queue<int[][]> queue = new ArrayDeque<>();

        int[][] mat=
        {
            { 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
            { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 },
            { 1, 1, 1, 1, 0, 0, 1, 0, 0, 0 },
            { 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
            { 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 1, 1, 1, 0 },
            { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
            { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
        };

        boolean[][] processed = new boolean[10][10];
        int islandCount = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j=0;j<mat.length;j++) {
                if(mat[i][j] == 1 && !processed[i][j]) {
                    islandCount++;
                }
            }
        }

        System.out.println("Total number of islands are:"+islandCount);
    }

    private static boolean isSafeToMove(int i, int j) {
        return (i<0 || j<0) && (i>9 || j>9);
    }

}
