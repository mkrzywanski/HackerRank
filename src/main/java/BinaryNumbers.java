public class BinaryNumbers {
    public static void main(String[] args) {
        int number = 9;
        System.out.println(toBinary(number));
        System.out.println(maxConsecutiveOnes(toBinary(number)));
    }

    static String toBinary(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 1) {
            int rest = number % 2;
            stringBuilder.append(rest);
            number = number / 2;
        }
        stringBuilder.append(number);
        return stringBuilder.reverse().toString();
    }

    static int maxConsecutiveOnes(String binaryString) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                current = 0;
            }
        }
        if (current > max) {
            max = current;
        }
        return max;
    }
}
