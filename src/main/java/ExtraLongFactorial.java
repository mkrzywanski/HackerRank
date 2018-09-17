import java.math.BigInteger;

public class ExtraLongFactorial {
    static void extraLongFactorials(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(bigInteger.toString());
    }

    public static void main(String[] args) {
        extraLongFactorials(30);
    }
}
