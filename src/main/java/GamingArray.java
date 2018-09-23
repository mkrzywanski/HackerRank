public class GamingArray {
    public static void main(String[] args) {
        int[] array = {2, 1, 3};
        System.out.println(gamingArray(array));

    }

    static int gamingArray(int[] arr) {
        return gamingArrayRec(arr, arr.length - 1, 0);

    }

    static int gamingArrayRec(int[] arr, int end, int whoseTurn) {
        whoseTurn = whoseTurn == 0 ? 1 : 0;

        if (end == -1) {
            return whoseTurn;
        }

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return gamingArrayRec(arr, maxIndex - 1, whoseTurn);
    }

    static int loop(int arr[]) {
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }
}
