import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SpiralOrder {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//        System.out.println(new Solution().spiralOrder(matrix));
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(new Solution().spiralOrder(matrix1));
    }

    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix.length == 1) {
                return Arrays.stream(matrix[0]).boxed().collect(toList());
            }
            var result = new ArrayList<Integer>();
            spiralHelper(matrix, 0, 0, matrix.length, matrix[0].length, result);
            return result;

        }

        private void spiralHelper(int[][] matrix, int row, int column, int rowLength, int columnLength, ArrayList<Integer> result) {
            if (result.size() >= matrix.length * matrix[0].length) {
                return;
            }
            while (column < columnLength) {
                result.add(matrix[row][column++]);
            }
            column--;
            row++;
            while (row < rowLength) {
                result.add(matrix[row++][column]);
            }
            if (result.size() >= matrix.length * matrix[0].length) {
                return;
            }
            row--;
            column--;
            while (column >= matrix[0].length - columnLength) {
                result.add(matrix[row][column--]);
            }
            column++;
            row--;
            while (row > matrix.length - rowLength) {
                result.add(matrix[row--][column]);
            }
            spiralHelper(matrix, row + 1, column+1, rowLength - 1, columnLength - 1, result);
        }
    }
}

