import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            Integer currentValue = map.get(ar[i]);
            if (currentValue == null) {
                map.put(ar[i], 1);
            } else {
                map.merge(ar[i], 1, (integer, integer2) -> integer + integer2);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            while (value >= 2) {
                count++;
                value -= 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(array.length, array));
    }
}
