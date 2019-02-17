public class AngryProffesor {
    public static void main(String[] args) {
        int[] arr = {-1, -3, 4, 2};
        System.out.println(angryProfessor(3, arr));


    }

    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                count++;
            }
        }
        return count >= k ? "NO" : "YES";

    }

}
