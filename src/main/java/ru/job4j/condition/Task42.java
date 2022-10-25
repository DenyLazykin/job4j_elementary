package ru.job4j.condition;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int temporary = number / 10;
        int temporary1 = temporary / 10;
        int num1 = temporary1 / 10;
        int num2 = temporary1 % 10;
        int num3 = temporary % 10;
        int num4 = number % 10;
        int num1AndNum2 = Integer.parseInt(num1 + "" + num2);
        int num3AndNum4 = Integer.parseInt(num3 + "" + num4);

        System.out.println(num1AndNum2 == num3AndNum4 ? "Да" : "Нет");
    }
}
