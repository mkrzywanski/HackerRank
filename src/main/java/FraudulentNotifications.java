import java.util.Arrays;

public class FraudulentNotifications {
    //TIMED OUT
    public static void main(String[] args) {
        int[] arrat = {1, 2, 3, 4, 4};
        System.out.println(activityNotifications(arrat, 4));
    }

    static int activityNotifications(int[] expenditure, int d) {
        int notifications = 0;

        int medianBeginIndex = 0;
        for (int i = d; i < expenditure.length; i++) {
            int exp = expenditure[i];
            double median = findMedian(expenditure, medianBeginIndex, medianBeginIndex + d);
            double doubleMedian = median * 2;
            if (exp >= doubleMedian) {
                notifications++;
            }
            medianBeginIndex++;
        }
        return notifications;
    }

    static double findMedian(int[] array, int begind, int end) {
        int[] temp = Arrays.copyOfRange(array, begind, end);
        Arrays.sort(temp);
        int medianIndex = (temp.length % 2) == 0 ? temp.length / 2 - 1 : temp.length / 2;
        if ((end - begind) % 2 == 0) {
            return (temp[medianIndex] + temp[medianIndex + 1]) / 2.0;
        } else {
            return temp[medianIndex];
        }
    }
}
