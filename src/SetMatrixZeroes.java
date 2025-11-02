import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        var solution = new Solution();
//        int[][] threeXthree = {
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 1, 1}
//        };
//        solution.setZeroes(threeXthree);
//        System.out.println(Arrays.deepToString(threeXthree));
//        int[][] threeXfour = {
//                {0, 1, 2, 0},
//                {3, 4, 5, 2},
//                {1, 3, 1, 5}
//        };
//        solution.setZeroes(threeXfour);
//        System.out.println(Arrays.deepToString(threeXfour));

        int[][] oneXone = {
                {-1, 2, 3}
        };
        solution.setZeroes(oneXone);
        System.out.println(Arrays.deepToString(oneXone));


    }

    static class Solution {
        public void setZeroes(int[][] matrix) {
            var zeroesList = new ArrayList<Integer>();
            var columns = matrix[0].length;
            var rows = matrix.length;
            if (columns == 1 && rows == 1) {
                return;
            }
            var zeroes = getZeroes(matrix, zeroesList, columns, rows);
            for (Integer zero : zeroes) {
                updateZeroes(matrix, getIndices(zero, columns), columns, rows);
            }

        }

        private void updateZeroes(int[][] matrix, int[] zeroIndices, int columns, int rows) {
            for (int i = 0; i < columns; i++) {
                matrix[zeroIndices[0]][i] = 0;
            }
            for (int i = 0; i < rows; i++) {
                matrix[i][zeroIndices[1]] = 0;
            }
        }

        List<Integer> getZeroes(int[][] matrix, List<Integer> zeroes, int columns, int rows) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 0) {
                        zeroes.add(getCellNumber(i, j, columns));
                    }
                }
            }
            return zeroes;
        }

        int getCellNumber(int i, int j, int columnLength) {
            return i * columnLength + j;
        }

        int[] getIndices(int cellNumber, int columnLength) {
            return new int[]{cellNumber / columnLength, cellNumber % columnLength};
        }
    }
}
