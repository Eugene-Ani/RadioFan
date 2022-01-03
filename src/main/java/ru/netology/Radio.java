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

    //СТАНЦИИ------------
    //Задание границ шкалы станций и установка станции в пределах диапазона
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        } else {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    //Переход с 9 станции на 0 и Переход с 0 станции на 9
    public void setStationOutRange(int newCurrentRadioStation) {
        if (newCurrentRadioStation == 10) {
            currentRadioStation = 0;
        }
        if (newCurrentRadioStation == -1) {
            currentRadioStation = 9;
        }
    }

    //Перебор станций вниз
    public void setStationDown(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            currentRadioStation = newCurrentRadioStation - 1;
        }
    }

    //Перебор станций вверх
    public void setStationUp(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 0) {
            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    //ГРОМКОСТЬ-------------
    //Регулировка громкости вниз
    public void increaseVolumeDown(int increaseVolume) {
        if (increaseVolume < 10) {
            increaseVolume = increaseVolume - 1;
        }
        currentVolume = increaseVolume;
    }

    //Регулировка громкости вверх
    public void increaseVolumeUp(int increaseVolume) {
        if (increaseVolume > 0) {
            increaseVolume = increaseVolume + 1;
        }
        currentVolume = increaseVolume;
    }

    //Регулировка за пределами возможного
    public void incorrectVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            currentVolume = 10;
        }
    }

}


