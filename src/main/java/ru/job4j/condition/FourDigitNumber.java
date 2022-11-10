package ru.job4j.condition;

/**
 * Класс в котором демонстрируется как разбить четырехзначное число на составляющие
 */
public class FourDigitNumber {
    public static void main(String[] args) {
        int i = 1234;
        int thousands = i / 1000;
        int hundreds = i % 1000 / 100;
        int tens = i % 1000 % 100 / 10;
        int single = i % 1000 % 100 % 10;
        System.out.println("thousands: " + thousands
                + ", hundreds : " + hundreds
                + ", tens: " + tens
                + ", single: " + single);
    }
}
