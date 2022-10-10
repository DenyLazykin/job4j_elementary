package ru.job4j.condition;

public class GameExercise {
    public static int checkGame(double percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            return (int) ((percent * prize) - pay);
        }
        return 0;
    }
}
