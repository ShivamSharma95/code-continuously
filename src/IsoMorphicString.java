import java.util.HashMap;

public class IsoMorphicString {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            var map = new HashMap<Character, Character>();
            for (int i = 0; i < t.length(); i++) {
                var target = t.charAt(i);
                var source = s.charAt(i);
                if (!map.containsKey(source))
                    map.put(source, target);
                else if (map.get(source) != target)
                    return false;
                if (!map.containsKey(target))
                    map.put(target, source);
                else if (map.get(target) != source)
                    return false;
            }
            return true;
        }
    }
}
