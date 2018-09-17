public class Encryption {
    // Complete the encryption function below.
    static String encryption(String s) {
        //s = s.replace(" ", "");
        double square = Math.sqrt(s.length());
        int lowerBound = (int) Math.floor(square);
        int higherBound = (int) Math.ceil(square);

        int size = (int) Math.ceil(s.length() / (double) higherBound);
        String[] spplits = new String[size];

        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < higherBound; j++) {
                int charIndex;
                if (lowerBound == higherBound) {
                    charIndex = i * (lowerBound) + j;
                } else {
                    charIndex = i * (lowerBound + 1) + j;
                }
                stringBuilder.append(s.charAt(charIndex));
                index++;
            }
            spplits[i] = stringBuilder.toString();
        }
        spplits[spplits.length - 1] = s.substring(index);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < higherBound; i++) {
            for (int j = 0; j < spplits.length; j++) {
                if (spplits[j].length() > i) {
                    stringBuilder.append(spplits[j].charAt(i));
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        //String s = "if man was meant to stay on the ground god would have given us roots";
        String s = "feedthedog";
        s = encryption(s);
        System.out.println(s);
    }
}
