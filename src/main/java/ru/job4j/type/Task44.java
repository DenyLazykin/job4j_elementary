package ru.job4j.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int numFirst1, numFirst2, numFirst3, numFirst4, numFirst5,
                numSecond1, numSecond2, numSecond3;
        numFirst1 = number1 / 100;
        numFirst2 = number1 % 100 / 10;
        numFirst3 = number1 % 100 % 10;
        numFirst4 = number1 % 1000 % 100 / 10;
        numFirst5 = number1 % 1000 % 100 % 10;
        numSecond1 = number2 / 100;
        numSecond2 = number2 % 100 / 10;
        numSecond3 = number2 % 100 % 10;
        System.out.println(numFirst1 + "" + numFirst2 + "" + numSecond3);
        if (numSecond1 != 0) {
            System.out.println(numSecond1 + "" + numSecond2 + "" + numFirst5);
        } else {
            System.out.println(numSecond2 + "" + numFirst5);
        }
    }
}