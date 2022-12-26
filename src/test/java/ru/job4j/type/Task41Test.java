package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task41Test {
    public String ln = System.lineSeparator();

    @Test
    public void when123Then312() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(123);
        String expected = "312" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when120Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(120);
        String expected = "12" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(100);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when106Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(106);
        String expected = "610" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(111);
        String expected = "111" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when121Then112() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(121);
        String expected = "112" + ln;
        assertThat(out.toString(), is(expected));
    }
}