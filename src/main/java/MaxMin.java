import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 2};
        int k = 2;
        System.out.println(maxMin(k, array));
    }

    static int maxMin(int k, int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int firstIndex = 0;
        int secondIndex = k - 1;
        while (secondIndex < arr.length) {
            int difference = arr[secondIndex] - arr[firstIndex];
            if (difference < min) {
                min = difference;
            }
            firstIndex++;
            secondIndex++;
        }
        return min;

    }
}
