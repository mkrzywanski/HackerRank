import java.util.Arrays;

public class CircularArrayNotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] queries = {0, 1, 2};
        System.out.println(Arrays.toString(circularArrayRotation(array, 2, queries)));
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = 0;
            for (int j = 0; j < a.length; j++) {
                if ((j + k) % a.length == queries[i]) {
                    index = j;
                    break;
                }
            }
            result[i] = a[index];
        }
        return result;

    }
}
