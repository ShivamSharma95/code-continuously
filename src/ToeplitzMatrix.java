public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
//        System.out.println(new Solution().isToeplitzMatrix(matrix));
        int[][] mat = {
                {41, 45},
                {81, 41},
                {73, 81},
                {47, 73},
                {76, 47},
                {79, 76}
        };
        System.out.println(new Solution().isToeplitzMatrix(mat));
        int[][] mat1 = {
                {1, 2},
                {2, 2}
        };
        System.out.println(new Solution().isToeplitzMatrix(mat1));
    }

    static class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            if (matrix.length == 1 || matrix[0].length == 1) return true;
            int row = matrix.length;
            int col = matrix[0].length;
            int i = row - 2;
            int j = 0;
            while (i >= 0 && j < col - 1) {
                int k = i, l = j;
                while ((k >= 0 || l < col)) {
                    int adjacentDigonal = ((k * col) + l) + col + 1;
                    k = adjacentDigonal / col;
                    l = adjacentDigonal % col;
                    if (k < row && l < col)
                        if (matrix[i][j] != matrix[k][l]) {
                            return false;
                        }
                }
                if (i > 0) {
                    i--;
                } else {
                    j++;
                }
            }
            return true;
        }

    }
}
