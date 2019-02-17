public class BirthdayCakeCandles {
    public static void main(String[] args) {

    }

    static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        int candles = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                candles++;
            }
        }
        return candles;
    }
}
