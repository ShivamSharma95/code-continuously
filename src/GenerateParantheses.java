import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(2));

    }

    static class Solution {
        public List<String> generateParenthesis(int n) {
            if (n == 0) return new ArrayList<>();
            var result = new ArrayList<String>();
            parantheseHelper(n, result, new StringBuilder());
            System.out.println(result.size());
            return result;
        }

        private void parantheseHelper(int n, List<String> result, StringBuilder res) {
            if (res.length() == n * 2) {
                result.add(res.toString());
            }
            for (int i = 0; i < n; i++) {
                res.append("()");
                parantheseHelper(n - 1, result, res);
                res.append(")");

            }

        }
    }
}
