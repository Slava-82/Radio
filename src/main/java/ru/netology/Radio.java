package ru.netology;

public class Radio {
    private int currentNumberRadio;
    private int currentVolumeRadio;

    int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    int getCurrentVolume() {
        return currentVolumeRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0)
            return;

        if (newCurrentVolume > 100)
            newCurrentVolume = 100;

        currentVolumeRadio = newCurrentVolume;

    }

    public void setCurrentNumberRadio(int newCurrentNumberRadio) {
        if (newCurrentNumberRadio < 0)
            return;

        if (newCurrentNumberRadio > 9)
            newCurrentNumberRadio = 9;

        currentNumberRadio = newCurrentNumberRadio;
    }

    public void next() {

        if (currentNumberRadio < 9) {
            currentNumberRadio = currentNumberRadio + 1;
        } else {
            currentNumberRadio = 0;
        }
    }

    public void prev() {

        if (currentNumberRadio > 0) {
            currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = 9;
        }
    }

    public void setter() {


    }

    public void increaseVolume() {
        if (currentVolumeRadio < 100) {
            currentVolumeRadio = currentVolumeRadio + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolumeRadio > 0) {
            currentVolumeRadio = currentVolumeRadio - 1;
        } else {
            currentVolumeRadio = 0;
        }
    }
}




