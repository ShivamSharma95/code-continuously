import java.util.HashMap;
import java.util.Map;

public class PowerXRaisedToN {
    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.00000, 8));
    }

    static class Solution {
        public double myPow(double x, int n) {
            if (n == -1) {
                return 1 / x;
            } else if (n == 1) {
                return x;
            } else if (x == 1 || n == 0)
                return 1;
            long longN = n;
            long absN = Math.abs(longN);
            var result = myPow(x, absN);
            return (n > 0) ? result : 1 / result;
        }

        Map<Integer, Double> map = new HashMap<>();

        public double myPow(double x, long n) {
            if (n <= 0) return 1;
            var result = myPow(x, n / 2);
            if (n % 2 == 1) {
                return result * result * x;
            }
            return result * result;
        }
    }
}
