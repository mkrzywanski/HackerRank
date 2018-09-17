package javatasks;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = 5;
            int b = 3;
            int n = 5;
            StringBuilder stringBuilder = new StringBuilder();
            int sum = a;
            for (int j = 0; j < n; j++) {
                int value = (int) Math.pow(2, j) * b;
                sum += value;
                stringBuilder.append(sum);
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder.toString());
        }
        in.close();
    }
}
