package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio(4);

        assertEquals(4, radio.getNumberOfChanel());
    }

    @Test
    public void shouldUseRadio2() {
        Radio radio = new Radio(10);


        assertEquals(10, radio.getNumberOfChanel());
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);

        radio.increaseVolume();

        int expected = 36;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.lowerVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lowerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);

        int expected = 8;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel4() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.setToMaxChanel();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.setToMinChanel();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }
}