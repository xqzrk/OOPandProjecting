package ru.netology.radio;

public class Radio {


    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        if (numberOfStations < 1) {
            return;
        }
        if (numberOfStations > 100) {
            numberOfStations = 100;
        }
        this.numberOfStations = numberOfStations;
    }

    public Radio() {

    }

    public int getNumberOfStations() {
        return numberOfStations;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberOfStations) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int next = currentStation + 1;
        if (currentStation >= (numberOfStations - 1)) {
            next = 0;
        }
        setCurrentStation(next);
    }

    public void prevStation() {
        int prev = currentStation - 1;
        if (currentStation <= 0) {
            prev = numberOfStations;
        }
        setCurrentStation(prev);
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }


}
