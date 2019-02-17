public class HackerRankInString {
    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        char[] chars = new char[]{'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        boolean[] visitedTab = new boolean[chars.length];
        int foundChars = 0;
        int charIndexToSearch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!visitedTab[charIndexToSearch] && s.charAt(i) == chars[charIndexToSearch]) {
                visitedTab[charIndexToSearch] = true;
                foundChars++;
                charIndexToSearch++;
            }
            if (foundChars == chars.length) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        System.out.println(hackerrankInString(s));
    }
}
