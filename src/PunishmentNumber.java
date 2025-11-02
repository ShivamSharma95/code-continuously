public class PunishmentNumber {
    public static void main(String[] args) {
        System.out.println(new Solution().punishmentNumber(10));
    }

    static class Solution {
        public int punishmentNumber(int n) {
            if (n == 1) return 1;
            long sum = 1;
            for (long i = 2; i <= n; i++) {
                long square = i * i;
                if (isPunishmentNumber(i*i)) {
                    sum += square;
                }
            }
            return Math.toIntExact(sum);
        }

        private boolean isPunishmentNumber(long n) {
            if (n < 10) return false;
//            while(n>)
            return true;
        }
    }
}
