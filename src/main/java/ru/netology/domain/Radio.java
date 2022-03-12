package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentChanel;
    private int numberOfChanel = 10;


    public Radio(int numberOfChanel) {
        this.numberOfChanel = numberOfChanel;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getNumberOfChanel() {
        return numberOfChanel;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxChanel() {
        currentChanel = 9;
    }

    public void setToMinChanel() {
        currentChanel = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > 9) {
            return;
        }
        if (currentChanel < 0) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setNumberOfChanel(int numberOfChanel) {
        if (numberOfChanel > 0) {
            setNumberOfChanel(numberOfChanel - 1);
        }
        if (numberOfChanel < 10) {
            setNumberOfChanel(numberOfChanel + 1);
        }
        this.numberOfChanel = numberOfChanel;
    }
}





