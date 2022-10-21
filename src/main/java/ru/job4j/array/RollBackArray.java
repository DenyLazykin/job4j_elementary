package ru.job4j.array;

public class RollBackArray {
    /*
    Метод записывает элементы в обратном порядке в новый массив
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }
}
