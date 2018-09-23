public class PlusMinus {
    public static void main(String[] args) {

    }

    static void plusMinus(int[] arr) {
        int positive = 0;
        int neutral = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                neutral++;
            }
        }

        System.out.println(positive * 1.0 / arr.length);
        System.out.println(negative * 1.0 / arr.length);
        System.out.println(neutral * 1.0 / arr.length);
    }
}
