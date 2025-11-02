public class MakeArrayElementToZero {
    public static void main(String[] args) {
        System.out.println(new Solution().countValidSelections(new int[]{1, 0, 2, 0, 3}));

    }

    static class Solution {
        public int countValidSelections(int[] nums) {
            var zeroIndex = getZeroIndex(nums);
            int i = zeroIndex, j = zeroIndex;
            while (j < nums.length && i >= 0) {
                if(nums[i]==0){
                    i--;
                    continue;
                }
                if(nums[j]==0){
                    j++;
                    continue;
                }
                if (nums[j] != 0) {
                    nums[j]--;
                }
                if (nums[i] != 0) {
                    nums[i]--;
                }

            }
            if (i < 0 || j >= nums.length)
                return 1;
            return 0;
        }

        int getZeroIndex(int[] nums) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}
