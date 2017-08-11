package algorithms.divideandconquer.coinchange;


public class Practice {
    public static void main(String[] args) {
        int[] coins = {100,50,20,10,5,2,1};
        System.out.println(coinRecursion(coins, 521, 0));
    }

    private static int coinRecursion(int[] coins, int amount, int accum) {
        if (amount == 0) return(0);
        if (accum == coins.length) return(Integer.MAX_VALUE);
        if (amount < coins[accum]) return(coinRecursion(coins, amount,accum+1));
        else {
            int c1 = coinRecursion(coins, amount, accum+1);
            int c2 = 1+ coinRecursion(coins,amount-coins[accum],accum);
            return (c1<c2)? c1: c2;
        }
    }
}
