package ru.job4j.format;

import java.util.Calendar;

/**
 * Практика по лекции: форматированние данных.
 * Для более глубокого понимания процесса в этом уроке вывод делается через цепочку методов (println + format).
 * Все эти методы можно переписать с помощью printf()
 * и получить такой же результат за исключением отсутствия у метода printf() перевода курсора на новую строку.
 */
public class Format {
    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT",
                name, instance, instance));
    }

    public static void getGreeting(String name) {
        System.out.println(String.format("Привет! Я %s", name));
    }

    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст %d", name, age));
    }

    public static void main(String[] args) {
        getGreeting("Den");
        getGreeting("Den", 33);
        System.out.println(String.format("Аргумент передан? %b", 4));
        System.out.println(String.format("Аргумент передан? %b", null));
        System.out.println(String.format("Jo%c4j", 'f'));
        System.out.format("String1%nString2");
        System.out.println();
        getGreetingAndTime("Den");
        System.out.println(String.format("Задаем число 0.99 - %.3f", 0.99));
        System.out.println(String.format("%1$,+016.4f", 5000000.0000));
    }
}
