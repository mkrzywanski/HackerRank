import java.util.Arrays;

public class LeftRotation {
    static int[] solution(int[] array, int rotations) {
        int[] newTab = new int[array.length];

        int realRotationsNumber = rotations % array.length;

        for (int i = 0; i < array.length; i++) {
            int newIndex = i - realRotationsNumber;
            if (newIndex < 0) {
                newIndex = array.length - Math.abs(newIndex);
            }
            if (newIndex != array.length) {
                newTab[newIndex] = array[i];
            } else {
                newTab[0] = array[i];
            }
        }
        return newTab;
    }

    public static void main(String[] args) {
        //int[] arr = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotated = solution(arr, 4);
        System.out.println(Arrays.toString(rotated));
    }
}
