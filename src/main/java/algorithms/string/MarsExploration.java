package algorithms.string;

public class MarsExploration {
    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int wrongCharCount = 0;
        for (int i = 0; i < s.length() - 2; i += 3) {
            if (s.charAt(i) != 'S') {
                wrongCharCount++;
            }
            if (s.charAt(i + 1) != 'O') {
                wrongCharCount++;
            }
            if (s.charAt(i + 2) != 'S') {
                wrongCharCount++;
            }
        }
        return wrongCharCount;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
    }
}
