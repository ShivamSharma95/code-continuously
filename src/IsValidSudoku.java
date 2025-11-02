import java.util.*;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        var rowCheck = new HashSet<Character>();
        var columnCheck = new HashSet<Character>();
        var cubeCheck = new HashMap<Integer, HashSet<Character>>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowCheck.contains(board[i][j])) {
                        return false;
                    } else {
                        rowCheck.add(board[i][j]);
                    }
                    var cube = (((i/3) * 3) + (j / 3)) + 1;
                    if (cubeCheck.containsKey(cube) && cubeCheck.get(cube).contains(board[i][j])) {
                        return false;
                    } else {
                        if (cubeCheck.get(cube) == null || cubeCheck.get(cube).isEmpty()) {
                            cubeCheck.put(cube, new HashSet<>(Set.of(board[i][j])));
                        } else {
                            cubeCheck.get(cube).add(board[i][j]);
                        }
                    }
                }
                if (board[j][i] != '.') {
                    if (columnCheck.contains(board[j][i])) {
                        return false;
                    } else {
                        columnCheck.add(board[j][i]);
                    }
                }

            }
            rowCheck = new HashSet<>();
            columnCheck = new HashSet<>();
        }
        return true;
    }

}
