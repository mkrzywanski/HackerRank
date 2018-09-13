public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int index = 0;
        while (index + 1 < c.length ) {
            if (index + 2 < c.length && c[index + 2] == 0) {
                jumps++;
                index += 2;
            } else if (index + 1 < c.length && c[index + 1] == 0) {
                jumps++;
                index += 1;
            }
        }
        return jumps;
    }


    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(array));
    }
}
