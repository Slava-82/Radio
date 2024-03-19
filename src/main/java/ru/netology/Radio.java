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
        int nextNumberRadio = currentNumberRadio + 1;
        setCurrentNumberRadio(nextNumberRadio);

    }

    public void prev() {
        int prevNumberRadio = currentNumberRadio - 1;
        setCurrentNumberRadio(prevNumberRadio);

    }

    public void setter() {


    }

    public void increaseVolume() {

        int increaseCurrentVolumeRadio = currentVolumeRadio + 1;
        setCurrentVolume(increaseCurrentVolumeRadio);

    }

    public void decreaseVolume() {
        int decreaseCurrentVolumeRadio = currentVolumeRadio - 1;
        setCurrentVolume(decreaseCurrentVolumeRadio);

    }
}




