import java.util.HashMap;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(701));
    }

    static class Solution {
        public String convertToTitle(int columnNumber) {
            HashMap<Integer, Character> alphabetMap = new HashMap<>();
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                alphabetMap.put(ch - 'A' + 1, ch);
            }
            return getColumn(columnNumber, alphabetMap);
        }

        String getColumn(int columnNumber, HashMap<Integer, Character> alphabetMap) {
            var result = new StringBuilder();
            while (columnNumber > 0) {
                var reminder = columnNumber % 26;
                if(reminder==0){
                    result.append(alphabetMap.get(26));
                }else{
                    result.append(alphabetMap.get(reminder));
                }
                columnNumber /= 26;
            }
            return result.reverse().toString();
        }
    }
}
