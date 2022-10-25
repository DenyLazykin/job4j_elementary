package ru.job4j.array;

public class Matrix {
     /**
     * Метод формирует таблицу умножения
      * создаем двумерный массив, в который будем записывать значения
      * цикл для прохождения по каждому элементу массива
      * записываем значения в созданный массив
     * @param size размер таблицы
     * @return постотроенную таблицу, согласно указаному размеру
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }
}
