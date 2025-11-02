public class Divide {
    public static void main(String[] args) {
        System.out.println(new Solution().divide(-2147483648, -2));
    }

    static class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == 0) return 0;
            if (divisor == 1) return dividend;
            if (divisor == -1 && dividend < 0) {
                if(Math.abs((long)dividend)>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else return Math.abs(dividend);
            }
            return (int)divideHelper(dividend, divisor, 0);
        }

        private long divideHelper(long dividend, long divisor, long i) {
            if (Math.abs(dividend) < Math.abs(divisor)) return i;
            long sum = divisor, multiple = 1;

            while ((sum + sum) <= Math.abs(dividend)) {
                sum += sum;
                multiple += multiple;
            }
            if (dividend < 0 && divisor > 0) {
                return divideHelper(dividend + divisor, divisor, i - multiple);
            } else if (dividend < 0 && divisor < 0) {
                return divideHelper(dividend - divisor, divisor, i + multiple);
            } else if (dividend > 0 && divisor < 0) {
                return divideHelper(dividend + divisor, divisor, i - multiple);
            } else {
                return divideHelper(dividend - divisor, divisor, i + multiple);
            }
        }
    }
}
