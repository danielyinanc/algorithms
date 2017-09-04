package com.rainmakeross.algorithms.types.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MarksCakeWalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }


        List<Integer> reverseSortedList = Arrays.stream(calories).boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSortedList);
        long val = 0;
        for(int i=0;i<n;i++) {
            val += (Math.pow(2,i) * reverseSortedList.get(i));
        }
        System.out.println(val);
    }
}
