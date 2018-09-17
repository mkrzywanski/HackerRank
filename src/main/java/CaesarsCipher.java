import java.util.HashMap;
import java.util.Map;

public class CaesarsCipher {
    private static String ORIGINAL_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        String cipherKey = rotateAlphabet(k);
        Map<Character, Character> map = createCipherMap(cipherKey);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            Character encryptedChar = map.get(currentChar);
            if (encryptedChar == null) {
                stringBuilder.append(currentChar);
            } else {
                stringBuilder.append(encryptedChar);
            }
        }
        return stringBuilder.toString();
    }

    static String rotateAlphabet(int rotations) {
        int originalAlphabetLength = ORIGINAL_ALPHABET.length();
        int realRotations = rotations % originalAlphabetLength;
        char[] chars = new char[originalAlphabetLength];
        for (int i = 0; i < originalAlphabetLength; i++) {
            int temp = i - realRotations;
            int newIndex = temp >= 0 ? temp : originalAlphabetLength - (Math.abs(temp));
            chars[newIndex] = ORIGINAL_ALPHABET.charAt(i);
        }
        return new String(chars);
    }

    static Map<Character, Character> createCipherMap(String cipherKey) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < ORIGINAL_ALPHABET.length(); i++) {
            map.put(ORIGINAL_ALPHABET.charAt(i), cipherKey.charAt(i));
            map.put(Character.toUpperCase(ORIGINAL_ALPHABET.charAt(i)), Character.toUpperCase(cipherKey.charAt(i)));
        }
        return map;
    }

    public static void main(String[] args) {
        String sentence = "www.abc.xy";
        int rotations = 87;
        System.out.println(caesarCipher(sentence, rotations));
    }
}
