package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char symbols = board[row][0];
        for (int index = 1; index < board[row].length; index++) {
            if (board[row][index] != symbols) {
                result = false;
                break;
            }
        }
        return result;
    }
}
