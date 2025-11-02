import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<String> letterCombinations(String digits) {
            var result = new ArrayList<String>();
            if (digits.isEmpty())
                return result;
            var map = new HashMap<Character, List<String>>();
            map.put('2', List.of("a", "b", "c"));
            map.put('3', List.of("d", "e", "f"));
            map.put('4', List.of("g", "h", "i"));
            map.put('5', List.of("j", "k", "l"));
            map.put('6', List.of("m", "n", "o"));
            map.put('7', List.of("p", "q", "r", "s"));
            map.put('8', List.of("t", "u", "v"));
            map.put('9', List.of("w", "x", "y", "z"));
            if (digits.length() > 1) {
                letterCombinationHelper(digits, map, result, new StringBuilder());
                return result;
            } else {
                return map.get(digits.charAt(0));
            }
        }

        void letterCombinationHelper(String digits, HashMap<Character, List<String>> map, List<String> result, StringBuilder current) {
            if (!result.isEmpty() && current.length() == digits.length()) {
                result.add(current.toString());
            }
            for (var digit : digits.toCharArray()) {
                int key = digit - '0';
                for (int i = 0; i < key; i++) {
                    var keys = map.get(digit);
                    for (int j = 0; j < keys.size() && i != j; j++) {
                        current.append(keys.get(i));
                    }
                }
            }
        }
    }
}
