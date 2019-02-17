import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangrams {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static String pangrams(String s) {
        s = s.toLowerCase().replace(" ", "");

        Set<Character> sentenceCharsSet = new HashSet<>();
        Set<Character> alphabetCharsSet = createAlphabetCharactersSet();

        for (char c : s.toCharArray()) {
            sentenceCharsSet.add(c);
        }
        if (sentenceCharsSet.equals(alphabetCharsSet)) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

    static Set<Character> createAlphabetCharactersSet() {
        return ALPHABET.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

    }

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s));
    }
}
