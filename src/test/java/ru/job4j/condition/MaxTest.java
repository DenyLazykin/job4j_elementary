package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To1Then2() {
        int left = 1;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void equals() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstMaxSecondAndThird() {
        int first = 10;
        int second = 9;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstEqualsSecondAndThird() {
        int first = 10;
        int second = 10;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstMaxSecondAndThirdAndFour() {
        int first = 10;
        int second = 9;
        int third = 8;
        int four = 9;
        int result = Max.max(first, second, third, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEqualsFirstAndSecondAndThirdAndFour() {
        int first = 10;
        int second = 10;
        int third = 10;
        int four = 10;
        int result = Max.max(first, second, third, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}