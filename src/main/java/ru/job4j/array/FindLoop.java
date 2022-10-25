package ru.job4j.array;

public class FindLoop {
    /**
     * Метод осуществляет поиск элемента в массиве
     * @param data массив чисел
     * @param el элемент, который нужно найти
     * @return если элемента нет в массиве, то возвращаем -1
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод осуществляет поиск элемента в массиве в указанном диапазоне
     * @param data массив чисел
     * @param el элемент, который нужно найти
     * @param start индекс, с которого начинаем поиск
     * @param finish индекс, которым заканчиваем поиск
     * @return если элемента нет в массиве, то возвращаем -1
     */
    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
