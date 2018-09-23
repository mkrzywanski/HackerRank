public class TheMaximumSubarray {
    public static void main(String[] args) {

    }
    static int[] maxSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int max = arr[0];

        int maxSubsequence = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > 0) {
                maxSubsequence += arr[i];
            }
            max = Math.max(arr[i], max + arr[i]);
            maxSoFar = Math.max(max, maxSoFar);
        }
        if(maxSoFar < 0) {
            maxSubsequence = maxSoFar;
        } else if(arr[0] > 0) {
            maxSubsequence += arr[0];
        }
        int[] result = new int[2];
        result[0] = maxSoFar;
        result[1] = maxSubsequence;
        return result;

    }
}
