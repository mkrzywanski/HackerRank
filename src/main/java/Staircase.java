public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }

    static void staircase(int n) {
        int spacesNumber = n-1;
        for(int i = 0;i < n;i++) {
            for(int j = 0; j < spacesNumber;j++) {
                System.out.print(" ");
            }
            for(int z = 0; z < n - spacesNumber;z++) {
                System.out.print("#");
            }
            spacesNumber--;
            System.out.println();
        }

    }
}
