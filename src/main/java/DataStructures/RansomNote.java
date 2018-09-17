package DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote {
    public static void main(String[] args) {

    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : magazine) {
            Integer value = map.get(s);
            if (value == null) {
                map.put(s, 1);
            } else {
                map.merge(s, 1, (integer, integer2) -> integer + integer2);
            }
        }

        for (String s : note) {
            Integer value = map.get(s);
            if (value == null || value == 0) {
                System.out.println("No");
                return;
            } else {
                map.merge(s, -1, (integer, integer2) -> integer + integer2);
            }

        }
        System.out.println("Yes");
    }
}
