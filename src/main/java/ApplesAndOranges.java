public class ApplesAndOranges {
    public static void main(String[] args) {

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
        }

        int orangesCount = 0;
        int applesCount = 0;

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] >= s && apples[i] <= t) {
                applesCount++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] >= s && oranges[i] <= t) {
                orangesCount++;
            }
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);

    }
}
