import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1,2,3,4}));
    }
    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            var result = new ArrayList<List<Integer>>();

            List<Integer> current = new ArrayList<>();
            for(int num : nums){
                current.add(num);
            }
            permuteHelper(nums, result, current);
            return result;
        }

        private void permuteHelper(int[] nums, ArrayList<List<Integer>> result, List<Integer> current) {
            if(current.size() == nums.length) {
                result.add(new ArrayList<>(current));
                current = new ArrayList<>();
            }
            for(int i = 1; i < nums.length; i++){
                current.add(nums[i]);
                permuteHelper(nums, result, current);
                current.remove(current.size()-1);
            }
        }
    }
}
