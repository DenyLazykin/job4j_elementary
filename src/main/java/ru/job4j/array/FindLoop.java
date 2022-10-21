package ru.job4j.array;

public class FindLoop {
    /*
    Метод осуществляет поиск элемента в массиве
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

    /*
    Метод осуществляет поиск элемента в массиве в указанном диапазоне
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
