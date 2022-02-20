package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentVolume;
    }

    //СТАНЦИИ-----------------

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setToNextStation(int currentRadioStation) {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void setToPreviousStation(int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }


    //ГРОМКОСТЬ----------------------
    //Установка границ громкости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            this.currentVolume = 10;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    //Регулировка громкости вниз
    public void increaseVolumeDown() {
        currentVolume = currentVolume - 1;
    }

    //Регулировка громкости вверх
    public void increaseVolumeUp() {
        currentVolume++;
    }

}

