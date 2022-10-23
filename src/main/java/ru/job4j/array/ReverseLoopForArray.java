package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[numbers.length - i - 1];
            System.out.println(el);
        }
        /* Ниже применент обратный проход в цикле, так тоже можно
           for (int i = numbers.length - 1; i >=0 ; i--) {
             int el = numbers[i];
             System.out.println(el); */
    }
}
