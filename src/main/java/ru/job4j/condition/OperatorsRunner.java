package ru.job4j.condition;

/**
 * мы в коде при использовании составных операторов присваивания
 * мы часто переназначали переменную first или second – связано это с тем,
 * что при использовании операторов мы переназначаем значение левой от знака присваивания переменной
 */
public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        first += second;
        System.out.println("Result sum: " + first);
        second -= first;
        System.out.println("Result subtract: " + second);
        first *= second;
        System.out.println("Result multiply: " + first);
        second /= first;
        System.out.println("Result divide: " + second);
    }
}
