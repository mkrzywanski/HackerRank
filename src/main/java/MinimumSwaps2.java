public class MinimumSwaps2 {
    public static void main(String[] args) {

    }

    static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                int j = i;
                while (arr[j] != i + 1) {
                    j++;
                }
                swap(arr, i, j);
                swapCount++;
            }
        }
        return swapCount++;
    }
}
