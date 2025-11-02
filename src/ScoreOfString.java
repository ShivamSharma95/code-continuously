public class ScoreOfString {
    public static void main(String[] args) {
        System.out.println(new Solution().scoreOfString("hello"));
    }

    static class Solution {
        public int scoreOfString(String s) {
            return scoreOfString(s, 1);
        }

        private int scoreOfString(String s, int i) {
            if (s.length() == i) return 0;
            var result = Math.abs(s.charAt(i) - s.charAt(i - 1));
            return result + scoreOfString(s, i + 1);
        }

    }
}
