public class NewYearChaos {
    public static void main(String[] args) {
        int[] tab = {2, 1, 5, 3, 4};
        minimumBribes(tab);
    }

    static void minimumBribes(int[] q) {
        int bribes = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < q.length - 1; i++) {
                if (q[i] > q[i + 1]) {
                    swap(q, i, i + 1);
                    swapped = true;
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }

    static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
