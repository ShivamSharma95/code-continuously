public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        System.out.println(new Solution().minCost("aaaac", new int[]{1, 2, 3, 4, 5}));
    }

    static class Solution {
        public int minCost(String colors, int[] neededTime) {
            if (neededTime.length <= 1) return 0;
            return minCost(colors, neededTime, 0);
        }

        private int minCost(String colors, int[] neededTime, int start) {
            if (start >= neededTime.length - 1) return 0;
            int sum = minCost(colors, neededTime, start + 1);
            if (colors.charAt(start) == colors.charAt(start + 1)) {
                return sum + Math.min(neededTime[start], neededTime[start + 1]);
            }
            return sum;
        }
    }
}
