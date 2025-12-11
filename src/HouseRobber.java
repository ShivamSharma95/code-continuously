import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(new Solution().rob(new int[]{2, 1, 1, 2})); //4
        System.out.println(new Solution().rob(new int[]{1, 2, 1, 1}));//3
        System.out.println(new Solution().rob(new int[]{4, 1, 2, 7, 5, 3, 1})); //14
        System.out.println(new Solution().rob(new int[]{82, 217, 170, 215, 153, 55, 185, 55, 185, 232, 69, 131, 130, 102})); //1082
        System.out.println(new Solution().rob(new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124}));
    }

    static class Solution {
        public int rob(int[] nums) {
            if (nums.length == 0) return 0;
            if (nums.length == 1) return nums[0];
            int[] memo = new int[nums.length + 3];
            return rob(nums, 0, 0, memo);
        }

        public int rob(int[] nums, int i, int sum, int[] memo) {
            if (memo[i] != 0) {
                return memo[i];
            }
            if (i >= nums.length) {
                return sum;
            }
            sum += nums[i];
            var first = rob(nums, i + 2, sum, memo);
            var second = rob(nums, i + 1, sum, memo);
            memo[i] = Math.max(first, second);
            return memo[i];
        }
    }
}
//0,0
//1, 2
//3,4 - 3