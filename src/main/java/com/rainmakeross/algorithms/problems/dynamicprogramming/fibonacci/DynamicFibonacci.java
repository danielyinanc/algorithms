package com.rainmakeross.algorithms.problems.dynamicprogramming.fibonacci;


/**
 * Created a cache to eliminate recursive branch re-calculations
 *
 * PseudoCode
 * - if n <= 1 => set cache(n) = 1
 * - if not, set cache(n), if cache(n) is not set to fibonacci(n-1) + fibonacci(n-2)
 * - return cache(n)
 *
 */
public class DynamicFibonacci {
    private static long[] fibCache = new long[200];

    public static void main(String[] args) {
        System.out.println(recursiveFib(80));
    }

    private static long recursiveFib(int fib) {
        if(fib <= 1)
            fibCache[fib] = 1;
        if(fibCache[fib] == 0)
            fibCache[fib] = recursiveFib(fib -1) + recursiveFib(fib -2);
        return fibCache[fib];
    }
}
