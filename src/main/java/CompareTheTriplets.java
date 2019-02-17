import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        compareTriplets(integers, integerList);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2);
        result.add(0);
        result.add(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                Integer value = result.get(0);
                result.set(0, value + 1);
            } else if (a.get(i) < b.get(i)) {
                Integer value = result.get(1);
                result.set(1, value + 1);
            }

        }
        return result;
    }
}
