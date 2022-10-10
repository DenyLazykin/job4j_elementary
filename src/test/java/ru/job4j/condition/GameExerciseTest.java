package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GameExerciseTest {
    @Test
    public void checkGame() {
        int rsl = GameExercise.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = GameExercise.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}