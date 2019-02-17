package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
    //NOT FINISHED
    public static void main(String[] args) {
        System.out.println(isValid("abcdefghhgfedecba"));
    }

    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer val = map.get(c);
            if (val == null) {
                map.put(c, 1);
            } else {
                map.merge(c, 1, (integer, integer2) -> integer + integer2);
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 2) {
                return "NO";
            } else if (entry.getValue() == 2) {
                count++;
            }
            if (count > 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
