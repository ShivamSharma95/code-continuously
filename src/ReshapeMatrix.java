import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(new Solution().matrixReshape(matrix, 1, 4)));
    }

    static class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int col = mat[0].length;
            int row = mat.length;
            boolean requireUpdate = col * row == r * c;
            if (!requireUpdate) {
                return mat;
            }
            int[][] result = new int[r][c];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    var t = getCellNumber(getCellNumber(i, j, col), c);
                    result[t[0]][t[1]] = mat[i][j];
                }
            }
            return result;
        }

        int[] getCellNumber(int cellNumber, int columns) {
            return new int[]{(cellNumber / columns), (cellNumber % columns)};
        }

        int getCellNumber(int i, int j, int columns) {
            return (i * columns) + j;
        }
    }
}
