package ru.job4j.array;

public class MatrixCheck {
    /**
     * Метод проверяет заполнена ли строка в двухмерном массиве символом Х
     * @param board массив доски
     * @param row проверяемая строка
     * @return если элементы не в строку возвращаем false
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет заполнены ли все элементы в колонке - Х
     * @param board массив доски
     * @param column проверяемый столбец
     * @return если элементы не в столбце возвращаем false
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заполняет одномерный массив элементами диагонали двухмерного массива
     * @param board массив доски
     * @return если элементы не по диагонали возвращаем false
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет, находится ли на поле выйгрышная ситуация
     * @param board массив доски
     * @return true, если ситуация на поле выйгрышная
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X' && monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
