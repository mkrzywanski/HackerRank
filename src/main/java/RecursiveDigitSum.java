import java.util.Arrays;

public class RecursiveDigitSum {
    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        k = k % 9 ;
        for(int i = 0; i < k;i++) {
            stringBuilder.append(n);
        }
        String resulr = stringBuilder.toString();
        return superDigitRec(resulr);

    }

    static int superDigitRec(String n) {
        if(n.length() == 1) {
            return Integer.valueOf(n);
        }

        int[] numbers = new int[n.length()];

        for(int i = 0; i < n.length();i++) {
            numbers[i] = Character.getNumericValue(n.charAt(i));
        }

        long sum = Arrays.stream(numbers).sum();

        return superDigitRec(String.valueOf(sum));
    }

    public static void main(String[] args) {
        System.out.println(superDigit("148", 3));
    }
}
