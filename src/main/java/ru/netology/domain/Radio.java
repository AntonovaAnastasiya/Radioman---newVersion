package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentChanel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxChanel() {
        currentVolume = 9;
    }

    public void setToMinChanel() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextChanel() {
        if (currentChanel < 9) {
            currentChanel = currentChanel + 1;
        }
        if (currentChanel >= 9) {
            this.currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        }
        if (currentChanel <= 0) {
            this.currentChanel = 9;
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
}
