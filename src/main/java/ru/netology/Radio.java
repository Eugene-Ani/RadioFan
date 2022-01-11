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
    //Задание границ шкалы станций и установка станции в пределах диапазона
    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > 9) {
            return;
        } else {
            this.currentRadioStation = CurrentRadioStation;
        }
    }

    //Переход с 9 станции на 0 и Переход с 0 станции на 9
    public void setStationOutRange(int CurrentRadioStation) {
        if (CurrentRadioStation == 10) {
            currentRadioStation = 0;
        }
        if (CurrentRadioStation == -1) {
            currentRadioStation = 9;
        }
    }

    //Перебор станций вниз
    public void setStationDown() {
        currentRadioStation = currentRadioStation - 1;
    }

    //Перебор станций вверх
    public void setStationUp() {
        currentRadioStation++;
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


