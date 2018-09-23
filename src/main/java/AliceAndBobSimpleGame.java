public class AliceAndBobSimpleGame {
    public static void main(String[] args) {
        System.out.println(sillyGame(5));
    }

    static String sillyGame(int n) {
        if (n == 1) {
            return "Bob";
        }
        if (n == 2) {
            return "Alice";
        }
        boolean[] primes = new boolean[n - 1];

        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            int index = i * i;
            if (primes[index - 2]) {
                while (index < n) {
                    primes[index - 2] = false;
                    index += i;
                }
            }
        }

        int primeCount = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                primeCount++;
            }
        }

        if (primeCount % 2 == 0) {
            return "Bob";
        } else {
            return "Alice";

        }
    }
}
