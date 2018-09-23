import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Pairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 6, 4, 2};
        System.out.println(pairs(2, arr));
    }

    static int pairs(int k, int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< arr.length;i++) {
            set.add(arr[i]);
        }

        for(int i = 0; i < arr.length;i++) {
            if(set.contains(arr[i] - k)) {
                count++;
            }
        }
        return count;
    }
}
