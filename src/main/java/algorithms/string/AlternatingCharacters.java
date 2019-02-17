package algorithms.string;

public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "ABABABAB";
        System.out.println(alternatingCharacters(s));
    }

    static int alternatingCharacters(String s) {
        int count = 0;
        char currentChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                currentChar = s.charAt(i);
            }
        }
        return count;
    }
}
