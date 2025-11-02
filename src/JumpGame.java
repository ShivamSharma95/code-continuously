public class JumpGame {
    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{3,2,1,0,4}));
    }

    static class Solution {
        public boolean canJump(int[] nums) {
            return canJumpHelper(nums, 0);
        }

        boolean canJumpHelper(int[] nums, int jumpIndex) {
            if (jumpIndex >= nums.length - 1) return true;
            if(nums[jumpIndex] == 0) return false;
            int index = Math.min(nums[jumpIndex] + jumpIndex, nums.length - 1);
            while (index > jumpIndex) {
                if (canJumpHelper(nums, index))
                    return true;
                index--;
            }
            return false;
        }

    }

}
