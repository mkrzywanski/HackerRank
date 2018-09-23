public class StockMaximize {
    public static void main(String[] args) {
        int[] array = {1,2,100};
        System.out.println(stockmax(array));
    }

    static int stockmax(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length-1;i++) {
            min = Math.min(min, prices[i]);
            int difference = prices[i+1] - min;
            if(difference > maxProfit) {
                maxProfit = difference;
            }
        }
        return maxProfit;
    }
}
