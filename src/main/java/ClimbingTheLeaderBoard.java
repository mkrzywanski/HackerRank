import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClimbingTheLeaderBoard {
    //TEST CASE 6 TIMEOUT 18/20
    public static void main(String[] args) {
        int[] array = {100, 90, 90, 80, 75, 60};
        int[] alice = {90, 102};
        System.out.println(Arrays.toString(climbingLeaderboard(array, alice)));
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] results = new int[alice.length];

        Set<Integer> set = new LinkedHashSet<>();
        for (int r : scores) {
            set.add(r);
        }

        int[] arrayNoDups = new int[set.size()];

        int index = 0;
        for (int value : set) {
            arrayNoDups[index] = value;
            index++;
        }

        for (int i = 0; i < alice.length; i++) {
            int alicePositionFromRight = arrayNoDups.length;

            for (int j = arrayNoDups.length - 1; j >= 0; j--) {
                if (alice[i] >= arrayNoDups[j]) {
                    alicePositionFromRight--;
                } else {
                    break;
                }
            }

            results[i] = alicePositionFromRight + 1;
        }
        return results;

    }
}
