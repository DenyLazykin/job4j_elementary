package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Hello, World!!!";
        } else if (number % 5 == 0) {
            return "World";
        } else if (number % 3 == 0) {
            return "Hello";
        } else {
            return "Operation not support";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(15));
    }
}
