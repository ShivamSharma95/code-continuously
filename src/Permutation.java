import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2}));
    }

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            var result = new ArrayList<List<Integer>>();
            var visited = new int[nums.length];
            permuteHelper(nums, result, new ArrayList<>(), visited);
            return result;
        }

        private void permuteHelper(int[] nums, ArrayList<List<Integer>> result, List<Integer> current, int[] visited) {
            if (current.size() == nums.length) {
                result.add(new ArrayList<>(current));
                current = new ArrayList<>();
            }
            for (int i = 0; i < nums.length ; i++) {
                if(visited[i] == 1) continue;
                current.add(nums[i]);
                visited[i] = 1;
                permuteHelper(nums, result, current, visited);
                current.remove(current.size() - 1);
                visited[i] = 0;
            }
        }
    }
}
