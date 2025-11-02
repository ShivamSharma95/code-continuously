//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < numRows) return s;
        StringBuilder finalString = new StringBuilder();
        char[][] matrix = new char[numRows][s.length()];
        updateMatrix(matrix, 0, 0, 0, numRows, s);
        for (char[] rows : matrix) {
            for (char ch : rows) {
                if (ch != 0) {
                    finalString.append(ch);
                }
            }
        }
        return finalString.toString();
    }

    private static void updateMatrix(char[][] matrix, int row, int column, int index, int n, String s) {
        if (index < s.length()) {
            for (int i = 0; i < n && index < s.length(); i++) {
                matrix[i][column] = s.charAt(index++);
                row++;
            }
            column++;
            row = n - 2;
            for (int i = row; i >= 1 && index < s.length(); i--) {
                matrix[i][column++] = s.charAt(index++);
            }
            updateMatrix(matrix, row - 1, column, index, n, s);
        }


    }
}
