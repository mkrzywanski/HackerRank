public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long equalRepetitions = n / s.length();
        long rest = n % s.length();

        long aSignNumber = 0;
        long allACount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aSignNumber++;
            }
        }
        allACount += aSignNumber * equalRepetitions;
        String restString = s.substring(0, (int) rest);
        aSignNumber = 0;
        for (int i = 0; i < restString.length(); i++) {
            if (restString.charAt(i) == 'a') {
                aSignNumber++;
            }
        }
        allACount += aSignNumber;
        return allACount;
    }


    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
