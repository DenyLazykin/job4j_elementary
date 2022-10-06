package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K8Square5Dot55() {
        double expected = 5.55;
        int p = 15;
        int k = 8;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP256K185Square87Dot61() {
        double expected = 87.61;
        int p = 256;
        int k = 185;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}