package com.rainmakeross.algorithms.problems.divideandconquer.coinchange;

import java.util.Arrays;

public class Practice {
    // Returns the count of ways we can
    // sum S[0...m-1] coins to get sum n
    static int count( long coins[], int coinArrSize, long amount )
    {
        // If n is 0 then there is 1 solution
        // (do not include any coin)
        if (amount == 0)
            return 1;

        // If n is less than 0 then no
        // solution exists
        if (amount < 0)
            return 0;

        // If there are no coins and n
        // is greater than 0, then no
        // solution exist
        if (coinArrSize <=0 && amount >= 1)
            return 0;

        // count is sum of solutions (i)
        // including S[m-1] (ii) excluding S[m-1]
        return count( coins, coinArrSize - 1, amount ) +
                count( coins, coinArrSize, amount-coins[coinArrSize-1] );
    }

    static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }





    // Driver program to test above function
    public static void main(String[] args)
    {
        int i, j;
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( countWays(arr, arr.length,4));

    }


    //HackerRank main, int and longs fixed
/*    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.valueOf(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = countWays(c, m, n);
        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.close();

        scanner.close();
    }*/

}
