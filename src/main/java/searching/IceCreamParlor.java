package searching;

import java.util.HashMap;

public class IceCreamParlor {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        whatFlavors(arr, 4);
        whatFlavors2(arr, 4);
    }

    static void whatFlavors2(int[] cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            int difference = money - cost[i];
            if (map.containsKey(difference)) {
                int index1 = map.get(difference) + 1;
                int index2 = i + 1;
                System.out.println(index1 + " " + index2);
                return;
            } else {
                map.put(cost[i], i);
            }
        }

    }


    //n2
    static void whatFlavors(int[] cost, int money) {
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                if (i != j && cost[i] + cost[j] == money) {
                    int index1 = i + 1;
                    int index2 = j + 1;
                    System.out.println(index1 + " " + index2);
                    return;
                }
            }
        }
    }
}
