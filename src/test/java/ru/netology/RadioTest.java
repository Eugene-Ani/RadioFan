package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio volume = new Radio();

    //Станции -------------------------
    //установка новой станции в пределах диапазона c установкой диапазона количества станций через конструктор
    @Test
    public void shouldInstallNewStation() {
        Radio station = new Radio(5, 8);
        assertEquals(5, station.getCurrentRadioStation());
    }

    //Установка станций вне диапазона в обе стороны
    @Test
    public void shouldInstallNewStationUp() {
        Radio station = new Radio();
        station.setCurrentRadioStation(12);
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldInstallNewStationDown() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-5);
        assertEquals(0, station.getCurrentRadioStation());
    }

    //Переход с максимума на 0 станцию
    @Test
    public void shouldNextStation() {
        Radio station = new Radio(9, 8);
        station.setStationOutRange(9);
        assertEquals(0, station.getCurrentRadioStation());
    }

    //Переход с 0 на максимальную станцию
    @Test
    public void shouldPreviousStation() {
        Radio station = new Radio(-1, 8);
        station.setStationOutRange(-1);
        assertEquals(8, station.getCurrentRadioStation());
    }

    //Перебор станций вниз
    @Test
    public void shouldNextStationRangeDown() {
        Radio station = new Radio();
        station.setCurrentRadioStation(7);
        station.setStationDown();
        assertEquals(6, station.getCurrentRadioStation());
    }

    //Перебор станций вверх
    @Test
    public void shouldNextStationRangeUp() {
        Radio station = new Radio();
        station.setCurrentRadioStation(3);
        station.setStationUp();
        assertEquals(4, station.getCurrentRadioStation());
    }


    //Громкость -----------------------

    //Проверка границ вверх и вниз
    @Test
    public void volumeBorderCheckUp() {
        volume.setCurrentVolume(110);
        assertEquals(100, volume.getCurrentRadioVolume());
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