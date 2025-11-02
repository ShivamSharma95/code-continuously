

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println((new Solution()).subsets(new int[]{1, 2, 3, 4}));
    }

    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> results = new ArrayList<>();
            subsets(nums, results, new ArrayList<>(), 0);
            return results ;
        }
        private void subsets(int[]nums, List<List<Integer>> results, List<Integer> current, int start) {
            results.add(new ArrayList<>(current));
            for(int i = start; i < nums.length; i++){
                current.add(nums[i]);
                subsets(nums, results, current, i + 1);
                current.remove(current.size() - 1);
            }
        }

    }
}
