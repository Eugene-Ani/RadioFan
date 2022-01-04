package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio station = new Radio();
    private Radio next = new Radio();
    private Radio volume = new Radio();

    //Станции - установка новой станции в пределах диапазона
    @Test
    public void shouldInstallNewStation() {
        station.setCurrentRadioStation(7);
        assertEquals(7, station.getCurrentRadioStation());
    }

    //Установка станций вне диапазона
    @Test
    public void shouldInstallNewStationUp() {
        station.setCurrentRadioStation(12);
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldInstallNewStationDown() {
        station.setCurrentRadioStation(-5);
        assertEquals(0, station.getCurrentRadioStation());
    }

    //Переход с 9 на 0 станцию
    @Test
    public void shouldNextStation() {
        next.setStationOutRange(10);
        assertEquals(0, next.getCurrentRadioStation());
    }

    //Переход с 0 на 9 станцию
    @Test
    public void shouldPreviousStation() {
        next.setStationOutRange(-1);
        assertEquals(9, next.getCurrentRadioStation());
    }

    //Перебор станций вниз
    @Test
    public void shouldNextStationRangeDown() {
        next.setStationDown(7);
        assertEquals(6, next.getCurrentRadioStation());
    }

    //Тест для покрытия 100% при переборе станций вниз
    @Test
    public void shouldNextStationRangeDownOver() {
        next.setStationDown(10);
        assertEquals(0, next.getCurrentRadioStation());
    }

    //Перебор станций вверх
    @Test
    public void shouldNextStationRangeUp() {
        next.setStationUp(7);
        assertEquals(8, next.getCurrentRadioStation());
    }

    //Тест для покрытия 100% при переборе станций вверх
    @Test
    public void shouldNextStationRangeUpOver() {
        next.setStationUp(-1);
        assertEquals(0, next.getCurrentRadioStation());
    }

    //Громкость - регулировка вниз
    @Test
    public void shouldIncreaseVolumeDown() {
        volume.increaseVolumeDown(8);
        assertEquals(7, volume.getCurrentRadioVolume());
    }

    //Тест для покрытия 100% по регулировке громкости вниз
    @Test
    public void shouldIncreaseVolumeDownOver() {
        volume.increaseVolumeDown(11);
        assertEquals(11, volume.getCurrentRadioVolume());
    }

    //Регулировка вверх
    @Test
    public void shouldIncreaseVolumeUp() {
        volume.increaseVolumeUp(3);
        assertEquals(4, volume.getCurrentRadioVolume());
    }

    //Тест для покрытия 100% по регулировке громкости вверх
    @Test
    public void shouldIncreaseVolumeUpOver() {
        volume.increaseVolumeUp(-2);
        assertEquals(-2, volume.getCurrentRadioVolume());
    }

    //Проверка границ вверх и вниз
    @Test
    public void volumeBorderCheckUp() {
        volume.incorrectVolume(11);
        assertEquals(10, volume.getCurrentRadioVolume());
    }

    @Test
    public void volumeBorderCheckDown() {
        volume.incorrectVolume(-1);
        assertEquals(0, volume.getCurrentRadioVolume());
    }
}