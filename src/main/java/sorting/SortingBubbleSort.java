package sorting;

public class SortingBubbleSort {
    public static void main(String[] args) {

    }

    static void countSwaps(int[] a) {
        int swaps = 0;
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swaps++;
                    hasSwapped = true;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
