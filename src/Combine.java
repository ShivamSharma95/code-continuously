import java.util.ArrayList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        System.out.println(new Solution().combine(4, 2));
    }

    static class Solution {
        public List<List<Integer>> combine(int n, int k) {
            var result = new ArrayList<List<Integer>>();
            combine(n, k, 1, new ArrayList<>(), result);
            return result;
        }

        void combine(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
            if (current.size() == k) {
                result.add(new ArrayList<>(current));
                return;
            }
            for (int i = start; i <= n; i++) {
                current.add(i);
                combine(n, k, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
