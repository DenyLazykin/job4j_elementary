package ru.job4j.oop.abstractclass.sport;

public class FootballPlayer extends Sportsman {
    @Override
    void run() {
        System.out.println("Средняня скорость бега");
    }

    public void  footKick() {
        System.out.println("Удар ногой по мячу");
    }
}
