package algorithms;

public class Array2DDS {
    //NOT 100% DONE
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                int currentSum = checkHourglassSum(arr, i, j);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int checkHourglassSum(int[][] array, int row, int column) {
        int sum = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if ((j != column && i != row + 1) || (j != column + 2 && i != row + 1) || (i == row +1 && j == column+1))
                    sum += array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{-1,-1,0,-9,-2,-2},
                {-2,-1,-6,-8,-2,-5},
                {-1,-1,-1,-2,-3,-4},
                {-1,-9,-2,-4,-4,-5},
                {-7,-3,-3,-2,-9,-9},
                {-1,-3,-1,-2,-4,-5}};
        System.out.println(hourglassSum(arr));
    }
}
