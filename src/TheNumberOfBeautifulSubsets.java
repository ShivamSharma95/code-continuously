import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TheNumberOfBeautifulSubsets {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<Integer>();
//        System.out.println(new Solution().isBeautiful(List.of(10,2,1), 3));
        System.out.println(new Solution().beautifulSubsets(new int[]{10, 4, 5, 7, 2, 1}, 3));

    }

    static class Solution {
        public int beautifulSubsets(int[] nums, int k) {
            var current = new ArrayList<Integer>();
            return beautifulSubsetsHelper(nums, current, 0, k);
        }

        public int beautifulSubsetsHelper(int[] nums, List<Integer> current, int start, int k) {
            int sum = 0;
            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                if (this.isBeautiful(current, k)) {
                    sum++;
                    sum += beautifulSubsetsHelper(nums, current, i + 1, k);
                }
                current.remove(current.size() - 1);
            }
            return sum;
        }

        public boolean isBeautiful(List<Integer> current, int k) {
            var set = new HashSet<>(current);
            for (int val : set) {
                if (set.contains(val - k)) {
                    return false;
                }
            }
            return true;
        }
    }
}
