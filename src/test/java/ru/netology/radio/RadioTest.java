package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetNumberOfDefaultStations() {

        int expected = 10;
        int actual = radio.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfStationsIfEntered() {
        Radio radio = new Radio(20);
        int expected = 20;
        int actual = radio.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetZeroNumberOfStations() {
        Radio radio = new Radio(0);
        int expected = 10;
        int actual = radio.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberOfStationsBeyondZero() {
        Radio radio = new Radio(-5);
        int expected = 10;
        int actual = radio.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberOfStationsAboveMax() {
        Radio radio = new Radio(120);
        int expected = 100;
        int actual = radio.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOne() {

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationZero() {

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationMinusOne() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowZero() {

        radio.setCurrentStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMaxMinusOne() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getNumberOfStations() - 1);

        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMaxStationsIfEntered() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(radio.getNumberOfStations());

        int expected = 50;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationMaxPlusOneIfEntered() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(radio.getNumberOfStations() + 1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio(90);
        radio.setCurrentStation(50);

        radio.nextStation();

        int expected = 51;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToZeroStation() {
        Radio radio = new Radio(80);
        radio.setCurrentStation(radio.getNumberOfStations());

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {

        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxAfterZeroStation() {

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = radio.getNumberOfStations();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreseVolume() {

        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreseVolume() {

        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreseVolumeAboveMax() {

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreseVolumeBeyoundMin() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreseVolumeToMin() {

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreseVolumeToMax() {

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreseVolumeFromMinus() {

        radio.setCurrentVolume(-3);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeFromAboveMax() {

        radio.setCurrentVolume(120);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

