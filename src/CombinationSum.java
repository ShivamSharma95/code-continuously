import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(new Solution().combinationSum(new int[] {2,3,5}, 8));
    }

    static class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            var result = new ArrayList<List<Integer>>();
            combinationSumHelper(candidates, target, 0, result, new LinkedList<>(), 0);
            return result;
        }

        void combinationSumHelper(int[] candidates, int target, int start, List<List<Integer>> result,
                                  List<Integer> current, int sum) {
            if (sum == target) {
                result.add(new ArrayList<>(current));
            } else if (sum > target) {
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                current.add(candidates[i]);
                sum += candidates[i];
                combinationSumHelper(candidates, target, i, result, current, sum);
                current.remove(current.size() - 1);
                sum -= candidates[i];
            }
        }
    }
}