package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {

    /**
     * Метод заменяет отрицательные значения в массиве на 0
     * @param array массив чисел
     * @return отредактированный массив, в котором отрицательные значение замененны на 0
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {-1, -2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        System.out.println(Arrays.deepToString(skip(array)));
    }
}
