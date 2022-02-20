package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio station = new Radio();
    private Radio next = new Radio();
    private Radio volume = new Radio();

    //Станции -------------------------
    //установка новой станции в пределах диапазона
    @Test
    public void shouldInstallNewStation() {
        station.setCurrentRadioStation(7);
        assertEquals(7, station.getCurrentRadioStation());
    }

    //Установка станций вне диапазона в обе стороны
    @Test
    public void shouldInstallNewStationUp() {
        station.setCurrentRadioStation(10);
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldInstallNewStationDown() {
        station.setCurrentRadioStation(-1);
        assertEquals(0, station.getCurrentRadioStation());
    }

    //Перебор станций вверх
    @Test
    public void shouldNextStation() {
        next.setToNextStation(7);
        assertEquals(8, next.getCurrentRadioStation());
    }

    //Перебор станций вниз
    @Test
    public void shouldPreviousStation() {
        next.setToPreviousStation(5);
        assertEquals(4, next.getCurrentRadioStation());
    }

    //Тест верхней границы
    @Test
    public void shouldNextStationRangeDown() {
        next.setToNextStation(9);
        assertEquals(0, next.getCurrentRadioStation());
    }


    //Тест нижней границы
    @Test
    public void shouldNextStationRangeUp() {
        next.setToPreviousStation(0);
        assertEquals(9, next.getCurrentRadioStation());
    }


    //Громкость -----------------------

    //Проверка границ вверх и вниз
    @Test
    public void volumeBorderCheckUp() {
        volume.setCurrentVolume(11);
        assertEquals(10, volume.getCurrentRadioVolume());
    }

    @Test
    public void volumeBorderCheckDown() {
        volume.setCurrentVolume(-1);
        assertEquals(0, volume.getCurrentRadioVolume());
    }

    //регулировка вниз
    @Test
    public void shouldIncreaseVolumeDown() {
        volume.setCurrentVolume(8);
        volume.increaseVolumeDown();
        assertEquals(7, volume.getCurrentRadioVolume());
    }

    //Регулировка вверх
    @Test
    public void shouldIncreaseVolumeUp() {
        volume.setCurrentVolume(3);
        volume.increaseVolumeUp();
        assertEquals(4, volume.getCurrentRadioVolume());
    }

}