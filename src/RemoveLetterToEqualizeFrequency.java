import java.util.Arrays;

public class RemoveLetterToEqualizeFrequency {
    public static void main(String[] args) {
        System.out.println(new Solution().equalFrequency("abcc"));
        System.out.println(new Solution().equalFrequency("aazz"));
        System.out.println(new Solution().equalFrequency("abbcc"));
        System.out.println(new Solution().equalFrequency("adbc"));
    }

    static class Solution {
        public boolean equalFrequency(String word) {
            int[] alphas = new int[26];
            int frequency = 0;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                alphas[index]++;
            }
            for (int alphaFrequency : alphas) {
                if (alphaFrequency != 0) {

                }
            }
            return true;
        }
    }
}
