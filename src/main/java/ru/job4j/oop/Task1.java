package ru.job4j.oop;

/**
 * В этом упражнении необходимо создать объект класса Tea в методе main класса Task1.
 * У объекта Tea необходимо вызвать метод prepare.
 */
public class Task1 {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();
    }
}

class Tea {
    void prepare() {
        System.out.println("I would like to drink a cup of tea.");
    }
}
