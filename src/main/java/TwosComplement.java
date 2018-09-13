import java.io.IOException;
import java.util.Scanner;

public class TwosComplement {

    static long twosCompliment(long a, long b) {
        long sum = 0;
        for (long i = a; i <= b; i++) {
            for (int j = 1; j <= 32; j++) {
                long value = 1 << j;
                long outcome = i & value;
                if (outcome == value) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(twosCompliment(-2,0));
    }
}
