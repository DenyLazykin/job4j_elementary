package ru.job4j.array;

public class Matrix {
    /*
    Метод формирует таблицу умножения
     */
    public static int[][] multiple(int size) {
        /* создаем двумерный массив, в который будем записывать значения */
        int[][] table = new int[size][size];
        /* цикл для прохождения по каждому элементу массива */
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                /* записываем значения в созданный массив */
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }
}
