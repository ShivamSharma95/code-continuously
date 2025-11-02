import java.util.Arrays;
import java.util.HashSet;

public class MaximumNumberOfDistinctElementAfterOperation {
    public static void main(String[] args) {
        System.out.println(new Solution().maxDistinctElements(new int[]{1, 2, 2, 3, 3, 4}, 2));
    }

    static class Solution {
        public int maxDistinctElements(int[] nums, int k) {
            if (k == 0) return nums[0];
            var set = new HashSet<Integer>();
            var kArray = new int[k * 2 + 1];
            int result = 0;
            for (int i = 0; i < kArray.length; i++) {
                kArray[i] = i - k;
            }
            for (int i = 0; i < (nums.length - kArray.length) + 1; i++) {
                var numCopy = Arrays.copyOf(nums, nums.length);
                int j = 0;
                while (j < (i + (kArray.length))) {
                    numCopy[j + i] += kArray[j];
                    if (set.contains(numCopy[j])) {
                        break;
                    } else {
                        set.add(numCopy[j]);
                    }
                    j++;
                }
                if (j > result) result = j;
                set = new HashSet<>();
            }
            return result;
        }
    }
}
