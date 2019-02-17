import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            Integer value = map.get(s);
            if (value == null) {
                map.put(s, 1);
            } else {
                map.merge(s, 1, (integer, integer2) -> integer + integer2);
            }
        }
        int[] results = new int[queries.length];
        int index = 0;

        for (String query : queries) {
            Integer val = map.get(query);
            if (val == null) {
                results[index] = 0;
            } else {
                results[index] = val;
            }
            index++;
        }
        return results;
    }

    public static void main(String[] args) {

    }
}
