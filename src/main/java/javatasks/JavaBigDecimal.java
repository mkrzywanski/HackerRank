package javatasks;

import java.math.BigDecimal;
import java.util.Arrays;

public class JavaBigDecimal {
    public static void main(String[] args) {
        String[] s = new String[]{"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Arrays.sort(s, (s1, s2) -> {
            BigDecimal bigDecimal = new BigDecimal(s1);
            BigDecimal bigDecimal1 = new BigDecimal(s2);
            return bigDecimal1.compareTo(bigDecimal);
        });

        //Output
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
