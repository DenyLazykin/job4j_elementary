package ru.job4j.type;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        int temp = number / 10;

        num1 = temp / 10;
        num2 = temp % 10;
        num3 = number % 10;
        if (num1 == 0 && num2 == 0 && num3 != 0) {
            System.out.println(num3);
        }
        if (num1 == 0 && num3 == 0 && num2 != 0) {
            System.out.println(num2);
        }
        if (num2 == 0 && num3 == 0 && num1 != 0) {
            System.out.println(num1);
        }
        if (num1 != 0 && num2 != 0 && num3 != 0) {
            System.out.println(num3 + "" + num2 + "" + num1);
        }
        if (num1 == 0 && num2 != 0 && num3 != 0) {
            System.out.println(num3 + "" + num2);
        }
        if (num2 == 0 && num1 != 0 && num3 != 0) {
            System.out.println(num3 + "" + num1);
        }
        if (num3 == 0 && num1 != 0 && num2 != 0) {
            System.out.println(num2 + "" + num1);
        }
    }

    public static void main(String[] args) {
        firstLastChange(650);
    }
}
