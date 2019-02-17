public class Day2Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double result;
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;
        result = meal_cost + tip + tax;
        System.out.println((int) Math.floor(result));

    }

    public static void main(String[] args) {
        solve(10.25, 17, 5);
    }
}
