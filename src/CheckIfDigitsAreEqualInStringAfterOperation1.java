public class CheckIfDigitsAreEqualInStringAfterOperation1 {
    public static void main(String[] args) {
        System.out.println(new Solution().hasSameDigits("3902"));

    }
    static class Solution {
        public boolean hasSameDigits(String s) {
            var result = new StringBuilder(s);
            while (s.length() > 2) {
                int i = 0;
                while (i < s.length() - 2) {
                    result.append(((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10);
                    i++;
                }
                s = result.toString();
                result.setLength(0);
            }
            return s.charAt(0) == s.charAt(1);

        }
    }
}
