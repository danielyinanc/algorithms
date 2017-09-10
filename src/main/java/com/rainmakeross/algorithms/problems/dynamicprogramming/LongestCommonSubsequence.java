package com.rainmakeross.algorithms.problems.dynamicprogramming;


import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        Map<String, Integer> hash = new HashMap<>();
        System.out.println(lcsLength(X, Y,X.length(), Y.length()));
        System.out.println(memoizedLcsLength(X, Y,X.length(), Y.length(), hash));
    }

    private static int lcsLength(String X, String Y, int m, int n) {
        // base case -- we reached end of either string
        if(m==0 || n==0)
            return 0;

        // If last chars match
        if(X.toCharArray()[m-1] == Y.toCharArray()[n-1])
            return lcsLength(X, Y, m-1, n-1) +1;

        //If last char does not match
        return Math.max(lcsLength(X,Y,m-1,n), lcsLength(X,Y,m,n-1));
    }

    private static int memoizedLcsLength(String X, String Y, int m, int n, Map<String, Integer> memoMap ){
        // base case -- we reached end of either string
        if(m==0 || n==0)
            return 0;
        String key = m+"|"+n;
        if(!memoMap.containsKey(key)) {
            // If last chars match
            if(X.toCharArray()[m-1] == Y.toCharArray()[n-1])
                memoMap.put(key, lcsLength(X, Y, m-1, n-1) +1);

            //If last char does not match
            memoMap.put(key,  Math.max(lcsLength(X,Y,m-1,n), lcsLength(X,Y,m,n-1)));
        }

        return memoMap.get(key);
    }
}
