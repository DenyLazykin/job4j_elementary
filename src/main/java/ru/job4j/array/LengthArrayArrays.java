package ru.job4j.array;

import java.util.Arrays;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен: "
                    + number.length);
            System.out.println(Arrays.toString(number));
        }
        System.out.println();
        int[][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] arrays : array) {
            System.out.println("Размер вложенного массива равен: "
                    + array.length);
            System.out.println(Arrays.toString(arrays));
        }
    }
}
