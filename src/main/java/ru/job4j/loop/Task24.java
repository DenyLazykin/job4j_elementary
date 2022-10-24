package ru.job4j.loop;
/* Задание: Написать код, который выводит в консоль через пробел 5 чисел, отвечающих следующим условиям:
- Серия начинается с числа, которое меньше входящего на 10.
- Каждое число в серии (начиная со второго) меньше предыдущего на 6. */
public class Task24 {
    public static void loop(int num) {
        for (int i = num - 10; i <= num + 6; i -= 6) {
            if (i < num - 34) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        loop(20);
    }
}
