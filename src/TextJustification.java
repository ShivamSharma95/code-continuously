import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        System.out.println(new Solution().fullJustify(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20));
    }

    static class Solution {
        public List<String> fullJustify(String[] words, int maxWidth) {
            int rowLength = 0;
            var row = new StringBuilder();
            var rows = new ArrayList<String>();
            for (String word : words) {
                rows.add(word);
            }

            return null;
        }
    }
}
