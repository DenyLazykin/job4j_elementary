package ru.job4j.condition;

/**
 * Написать код, который выводит в консоль наибольшую из последних цифр этих двух чисел.
 * Если последние цифры одинаковы, то вывести - "Одинаковые".
 */
public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int onesNum1 = num1 % 100 % 10;
        int onesNum2 = num2 % 100 % 10;
        if (onesNum1 > onesNum2) {
            System.out.println(onesNum1);
        }
        if (onesNum1 < onesNum2) {
            System.out.println(onesNum2);
        }
        if (onesNum1 == onesNum2) {
            System.out.println("Одинаковые");
        }
    }
}
