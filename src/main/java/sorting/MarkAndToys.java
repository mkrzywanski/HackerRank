package sorting;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {

    }

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        int toyCount = 0;
        int moneySoFar = 0;
        for(int i = 0; i < prices.length;i++) {
            if(moneySoFar + prices[i] <= k) {
                moneySoFar += prices[i];
                toyCount++;
            } else {
                return toyCount;
            }
        }
        return 0;
    }
}
