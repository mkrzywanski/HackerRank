import java.util.HashMap;
import java.util.Map;

public class TheTimeInWords {
    static Map<Integer, String> hours = new HashMap<>();
    static Map<Integer, String> minutesMap = new HashMap<>();

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        prepareHoursMap();
        prepareMinutesMap();
        StringBuilder stringBuilder = new StringBuilder();
        String hourString = hours.get(h);
        if (m < 30) {
            if (m == 0) {
                stringBuilder.append(hourString);
                stringBuilder.append(" o' clock");
            } else {
                if (m == 1) {
                    stringBuilder.append("one minute past ");
                } else if (m == 10) {
                    stringBuilder.append("ten minutes past ");
                } else if (m == 15) {
                    stringBuilder.append("quarter past ");
                } else {
                    String minutes = minutesMap.get(m);
                    stringBuilder.append(minutes);
                    stringBuilder.append(" minutes past ");
                }
                stringBuilder.append(hourString);
            }
        } else if (m > 30) {
            hourString = hours.get(h + 1);
            int minutes = 60 - m;
            String minutesString = minutesMap.get(minutes);
            if (m == 45) {
                stringBuilder.append("quarter to ");
            } else {
                stringBuilder.append(minutesString);
                stringBuilder.append(" minutes to ");
            }
            stringBuilder.append(hourString);
        } else {
            stringBuilder.append("half past ");
            stringBuilder.append(hourString);
        }
        return stringBuilder.toString();
    }

    static void prepareHoursMap() {
        hours.put(1, "one");
        hours.put(2, "two");
        hours.put(3, "three");
        hours.put(4, "four");
        hours.put(5, "five");
        hours.put(6, "six");
        hours.put(7, "seven");
        hours.put(8, "eight");
        hours.put(9, "nine");
        hours.put(10, "ten");
        hours.put(11, "eleven");
        hours.put(12, "twelve");
    }

    static void prepareMinutesMap() {
        minutesMap.put(1, "one");
        minutesMap.put(2, "two");
        minutesMap.put(3, "three");
        minutesMap.put(4, "four");
        minutesMap.put(5, "five");
        minutesMap.put(6, "six");
        minutesMap.put(7, "seven");
        minutesMap.put(8, "eight");
        minutesMap.put(9, "nine");
        minutesMap.put(10, "ten");
        minutesMap.put(11, "eleven");
        minutesMap.put(12, "twelve");
        minutesMap.put(13, "thirteen");
        minutesMap.put(14, "fourteen");
        minutesMap.put(15, "fifteen");
        minutesMap.put(16, "sixteen");
        minutesMap.put(17, "seventeen");
        minutesMap.put(18, "eighteen");
        minutesMap.put(19, "nineteen");
        minutesMap.put(20, "twenty");
        minutesMap.put(21, "twenty one");
        minutesMap.put(22, "twenty two");
        minutesMap.put(23, "twenty three");
        minutesMap.put(24, "twenty four");
        minutesMap.put(25, "twenty five");
        minutesMap.put(26, "twenty six");
        minutesMap.put(27, "twenty seven");
        minutesMap.put(28, "twenty eight");
        minutesMap.put(29, "twenty nine");
        minutesMap.put(30, "thirty");

    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 22));
    }

}
