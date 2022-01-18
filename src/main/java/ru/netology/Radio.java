package ru.netology;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int currentRadioStation; // текущая радиостанция
    private int numbersOfStation = 9; // количество радиостанций по умолчанию (10)
    private int currentVolume; // текущая громкость

//    public Radio() {
//    }

    public Radio(int currentRadioStation, int numbersOfStation) {
        this.currentRadioStation = currentRadioStation;
        this.numbersOfStation = numbersOfStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentVolume;
    }


    //СТАНЦИИ---------------------

    //Задание границ шкалы станций, установка станции в пределах диапазона
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > numbersOfStation) {
            return;
        } else {
            this.currentRadioStation = currentRadioStation;
        }
    }

    // Переход с максимальной станции на 0 и обратно
    public void setStationOutRange(int currentRadioStation) {
        if (currentRadioStation == numbersOfStation + 1) {
            this.currentRadioStation = 0;
        }
        if (currentRadioStation == -1) {
            this.currentRadioStation = numbersOfStation;
        }
    }

    //Перебор станций вниз
    public void setStationDown() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    //Перебор станций вверх
    public void setStationUp() {
        if (currentRadioStation < numbersOfStation) {
            currentRadioStation++;
        }
    }


    //ГРОМКОСТЬ--------------------

    //Установка границ громкости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            this.currentVolume = 100;
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


