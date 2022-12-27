package ru.job4j.oop.sport;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.run();
        footballPlayer.footKick();
        Athlete athlete = new Athlete();
        athlete.run();
        athlete.sprint();
    }
}
