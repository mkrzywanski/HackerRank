import java.util.*;

public class MissingNumbers {
    //not working for testcase 3
    static int[] missingNumbers(int[] arr, int[] brr) {
        Arrays.sort(arr);
        Arrays.sort(brr);

        int originalArrayIndex = 0;
        int reducedArrayIndex = 0;

        Set<Integer> set = new TreeSet<>();

        while (reducedArrayIndex < arr.length) {
            if (brr[originalArrayIndex] == arr[reducedArrayIndex]) {
                originalArrayIndex++;
                reducedArrayIndex++;
            } else {
                set.add(brr[originalArrayIndex]);
                originalArrayIndex++;
            }
        }

        int[] missingArray = new int[set.size()];
        int missingArrayIndex = 0;
        for (Integer i : set) {
            missingArray[missingArrayIndex] = i;
            missingArrayIndex++;
        }
        return missingArray;
    }

    static int[] treeMapSolution(int[] arr, int[] brr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < brr.length; i++) {
            Integer val = map.get(brr[i]);
            if (val == null) {
                map.put(brr[i], 1);
            } else {
                map.merge(brr[i], 1, (integer, integer2) -> integer + integer2);
            }
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], -1, (integer, integer2) -> integer + integer2);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                set.add(entry.getKey());
            }
        }
        int[] missingArray = new int[set.size()];
        int missingArrayIndex = 0;
        for (Integer i : set) {
            missingArray[missingArrayIndex] = i;
            missingArrayIndex++;
        }
        return missingArray;
    }

    public static void main(String[] args) {
        int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        System.out.println(Arrays.toString(missingNumbers(arr, brr)));
        System.out.println(Arrays.toString(treeMapSolution(arr, brr)));
    }
}
