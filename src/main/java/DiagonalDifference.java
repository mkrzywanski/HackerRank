public class DiagonalDifference {
    public static void main(String[] args) {

    }

    static int diagonalDifference(int[][] arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    firstDiagonalSum += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    secondDiagonalSum += arr[i][j];
                }
            }
        }
        return Math.abs(firstDiagonalSum - secondDiagonalSum);

    }
}
