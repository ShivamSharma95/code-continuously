import java.util.HashMap;
import java.util.HashSet;

public class EqualFrequency {
    public static void main(String[] args) {
        System.out.println(new Solution().equalFrequency("adbc"));
    }

    static class Solution {
        public boolean equalFrequency(String word) {
            int[] alphas = new int[26];
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                alphas[index]++;
            }
            int l = 0, r = alphas.length - 1;
            while (l < r) {
                if (alphas[l] == 0) {
                    l++;
                    continue;
                }
                if (alphas[r] == 0) {
                    r--;
                    continue;
                }
                if (alphas[l] == alphas[r]) {
                    l++;
                } else {
                    if (1 < Math.abs(alphas[l] - alphas[r])) {
                        return false;
                    } else {
                        l++;
                        r--;
                    }
                }
            }
            return true;
        }
    }
}
