package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";
        System.out.println(makeAnagram(s1, s2));
    }

    static Map<Character, Integer> stringToCharMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer val = map.get(c);
            if (val == null) {
                map.put(c, 1);
            } else {
                map.merge(c, 1, (integer, integer2) -> integer + integer2);
            }
        }
        return map;
    }

    static int makeAnagram(String a, String b) {
        Map<Character, Integer> map1 = stringToCharMap(a);
        Map<Character, Integer> map2 = stringToCharMap(b);

        int count = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Integer map1Value = entry.getValue();
            Integer map2Value = map2.get(entry.getKey());
            if (map2Value == null) {
                count += map1Value;
            } else {
                count += Math.abs(map1Value - map2Value);
            }
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            Integer mapValue = map1.get(entry.getKey());
            if (mapValue == null) {
                count += entry.getValue();
            }
        }
        return count;
    }
}
