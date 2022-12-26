package ru.job4j.type;

/**
 * Ниже представлен метод leftCircleShift(int number), который принимает целое положительное четырехзначное число.
 * Задание: Написать код, который выполняет "сдвиг цифр числа влево по кругу",
 * то есть цифры числа перемещаются на одну позицию влево
 * (единицы - на место десятков, десятки - на место сотен и тд),
 * при этом первая цифра перемещается на место единиц (становится последней). Результат вывести в консоль.
 * Например, для числа 1234 вывод должен быть:2341
 */
public class Task40 {
    public static void leftCircleShift(int number) {
        System.out.println(((number % 1000) * 10) + (number / 1000));
    }
}
