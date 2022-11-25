package ru.job4j.condition;

/**
 * Написать код, который изменяет эти числа следующим образом:
 * - Если числа имеют разные значения, то большее число уменьшается на 1, а меньшее - увеличивается на 1.
 * - Если числа одинаковы, то оба увеличиваются на 1.
 */
public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 != num2) {
            if (num1 > num2) {
                num1--;
                num2++;
            } else {
                num1++;
                num2--;
            }
        } else {
            num1++;
            num2++;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}


