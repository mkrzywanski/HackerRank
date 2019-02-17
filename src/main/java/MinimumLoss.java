import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumLoss {
    // Complete the minimumLoss function below.
    //n2
    static int minimumLoss(long[] price) {
        long minLoss = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                long loss = price[i] - price[j];
                if (loss >= 0 && loss < minLoss) {
                    minLoss = price[i] - price[j];
                }
            }
        }
        return (int) minLoss;
    }

    // n logn
    static int minimumLoss2(long[] price) {
        long minLoss = Integer.MAX_VALUE;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < price.length; i++) {
            map.put(price[i], i);
        }
        Arrays.sort(price);

        for (int i = 1; i < price.length; i++) {
            long dif = price[i] - price[i - 1];
            int firstIndex = map.get(price[i - 1]);
            int secondIndex = map.get(price[i]);
            if (secondIndex < firstIndex && dif < minLoss) {
                minLoss = dif;
            }
        }
        return (int) minLoss;
    }


    public static void main(String[] args) {
        long[] array = {20, 15, 8, 2, 12};
        System.out.println(minimumLoss(array));
        System.out.println(minimumLoss2(array));
    }
}
