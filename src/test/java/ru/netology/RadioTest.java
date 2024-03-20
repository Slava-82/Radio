package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void shouldSetterToRadioZero() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);
        radio.setter();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetterToRadio8() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(8);
        radio.setter();

        int expected = 8;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetterToRadioMaximusNine() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);
        radio.setter();

        int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetterToRadio1() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(1);
        radio.setter();

        int expected = 1;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToRadioZero() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToRadioOne() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToRadioEight() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextToRadioNine() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevToRadioNine() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevToRadioZero() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevToRadioOne() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume98() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume98() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.decreaseVolume();

        int expected = 97;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void setCurrentVolumeMinus() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setCurrentVolumeMaximumPlus() {

        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetterToRadio28QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(28);
        radio.setter();

        int expected = 28;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetterToRadio29QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(29);
        radio.setter();

        int expected = 29;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetterToRadio30QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(30);
        radio.setter();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetterToRadio0QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(0);
        radio.setter();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetterToRadio1QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(1);
        radio.setter();

        int expected = 1;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextToRadio28QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(28);
        radio.next();

        int expected = 29;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextToRadio29QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(29);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextToRadio0QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextToRadio1QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevToRadio1QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevToRadio0QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(0);
        radio.prev();

        int expected = 29;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevToRadio29QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(29);
        radio.prev();

        int expected = 28;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
    

    @Test

    public void shouldPrevToRadio28QuantityNumber30() {

        Radio radio = new Radio(30);
        radio.setCurrentNumberRadio(28);
        radio.prev();

        int expected = 27;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }


}
