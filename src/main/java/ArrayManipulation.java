public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] zeros = new int[n];
        int max = 0;
        for (int[] query : queries) {
            for (int i = query[0] - 1; i < query[1]; i++) {
                zeros[i] += query[2];
                if (zeros[i] > max) {
                    max = zeros[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
    }
}
