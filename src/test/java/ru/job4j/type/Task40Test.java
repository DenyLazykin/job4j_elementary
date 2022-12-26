package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task40Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234than2341() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1234);
        String expected = "2341" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1200than2001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1200);
        String expected = "2001" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000than1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1000);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1060than601() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1060);
        String expected = "601" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1006than61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1006);
        String expected = "61" + ln;
        assertThat(out.toString(), is(expected));
    }
}