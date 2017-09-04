package com.rainmakeross.algorithms.types.greedy.coinchange;


public class Practice {
    public static void main(String[] args) {
        int[] coins = {10,5,2,1};
        System.out.println(greedyCoinChange(coins, 124));
    }

    private static int greedyCoinChange(int[] coins, int amount) {
        int result = 0;
        for(int i =0;i<coins.length;i++) {
            result += amount /coins[i];
            amount %= coins[i];
        }

        if(amount != 0)
            return -1;
        return result;
    }
}
