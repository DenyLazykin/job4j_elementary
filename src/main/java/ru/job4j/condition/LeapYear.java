package ru.job4j.condition;

public class LeapYear {
    /**
     * Метод проверяет является ли год високосным
     * @param year год
     * @return true, если год високосный
     */
    public static boolean checkYear(int year) {
        if (year % 400 == 0 && year % 100 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}