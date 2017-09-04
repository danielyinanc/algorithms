package com.rainmakeross.algorithms.types.dynamicprogramming.coinchange;


public class Practice {
    public static void main(String[] args) {
        int[] coins = {10,5,2,1};
        System.out.println(dynamicCoinChange(coins, 124));
        System.out.println(dynamicCoinChangeMemoryImprov(coins, 124));

    }
    public static int dynamicCoinChange(int[] coins, int amount){
        int[][] tab = new int[amount+1][coins.length+1];
        for(int i = 0; i <= amount; i++)
            tab[i][coins.length] = Integer.MAX_VALUE;
        for(int j = 0; j < coins.length; j++)
            tab[0][j] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int j = coins.length-1; j >= 0; j--) {
                if (i < coins[j]) tab[i][j] = tab[i][j+1];
                else {
                    int c1 = tab[i][j+1];
                    int c2 = 1 + tab[i-coins[j]][j];
                    tab[i][j] = (c1 < c2)?c1 : c2;
                }
            }
        }
        return(tab[amount][0]);
    }

    public static int dynamicCoinChangeMemoryImprov(int[] coins, int amount){
        int[] tab = new int[amount+1];
        tab[0]=0;
        for(int i = 1; i <= amount; i++) {
            tab[i] = Integer.MAX_VALUE;
            for(int j = coins.length-1; j >= 0 ; j--) {
                if (i >= coins[j]){
                    int c = 1 + tab[i-coins[j]];
                    if (c < tab[i]) tab[i] = c;
                }
            }
        }
        return(tab[amount]);
    }
}
