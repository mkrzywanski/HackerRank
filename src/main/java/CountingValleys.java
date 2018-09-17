public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] chars = s.toCharArray();
        int currentPosition = 0;
        int valleysCount = 0;

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (currentChar == 'U') {
                currentPosition++;
            } else {
                currentPosition--;
            }
            if (currentPosition == 0 && chars[i] == 'U') {
                valleysCount++;
            }
        }
        return valleysCount;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
