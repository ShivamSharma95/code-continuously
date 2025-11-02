public class NQueen {
    public static void main(String[] args) {
        solveNQueen(4);
    }

    static char[][] solveNQueen(int n) {
        var board = createBoard(n);
        board[1][3] = 'Q';
        board[2][2] = 'Q';
//        System.out.println(isSafe(board, 0));

        print(board);
        return board;
    }

    private static boolean isSafe(char[][] board, int columnIndex, int rowIndex) {
        for (int i = 0; i < board.length && columnIndex != i; i++) {
            if (board[i][columnIndex] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < board.length && columnIndex != i; i++) {
            if (board[i][i] == 'Q') {
                return false;
            }
        }
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][columnIndex] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static char[][] createBoard(int n) {
        var board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return board;
    }

    static void print(char[][] board) {
        for (char[] chars : board) {          // iterate rows
            for (char aChar : chars) {   // iterate columns
                System.out.print(aChar + " ");
            }
            System.out.println(); // move to next row
        }
    }
}
