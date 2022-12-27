package ru.job4j.oop.outerclass.staticineerclass;

public class Car {
    private final String brand;
    private final String model;
    private static final String CAR_MANUAL = "Инструкция к автомобилю";

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public static TripComputer getTripComputer() {
        Car car = new Car("Марка", "Модель");
        return car.new TripComputer();
    }

    public String getBrand() {
        return brand;
    }

    public static class Transmission {
        public void accelerate() {
            System.out.println("Ускорение");
        }
    }

    public static class Brakes {
        public void brake() {
            System.out.println("Торможение");
        }
    }

    public class TripComputer {
        public String info = "Бортовой компьютер";
        private final String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Car.this.model);
        }
    }

    public static class Manual {
        public static String getManual() {
            return CAR_MANUAL;
        }
    }
}
