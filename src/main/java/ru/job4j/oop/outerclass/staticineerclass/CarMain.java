package ru.job4j.oop.outerclass.staticineerclass;

public class CarMain {
    public static void main(String[] args) {
        Car.Manual manual = new Car.Manual();
        System.out.println(Car.Manual.getManual());
    }
}
