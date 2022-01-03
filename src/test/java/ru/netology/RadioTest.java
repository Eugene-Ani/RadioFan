package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //Станции - установка новой станции в пределах диапазона
    @Test
    public void shouldInstallNewStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(7);
        int expected = 7;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    //Установка станций вне диапазона
    @Test
    public void shouldInstallNewStationUp() {
        Radio station = new Radio();
        station.setCurrentRadioStation(12);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldInstallNewStationDown() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    //Переход с 9 на 0 станцию
    @Test
    public void shouldNextStation() {
        Radio next = new Radio();
        next.setStationOutRange(10);
        int expected = 0;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    //Переход с 0 на 9 станцию
    @Test
    public void shouldPreviousStation() {
        Radio next = new Radio();
        next.setStationOutRange(-1);
        int expected = 9;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    //Перебор станций вниз
    @Test
    public void shouldNextStationRangeDown() {
        Radio next = new Radio();
        next.setStationDown(7);
        int expected = 6;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    //Тест для покрытия 100% при переборе станций вниз
    @Test
    public void shouldNextStationRangeDownOver() {
        Radio next = new Radio();
        next.setStationDown(10);
        int expected = 0;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    //Перебор станций вверх
    @Test
    public void shouldNextStationRangeUp() {
        Radio next = new Radio();
        next.setStationUp(7);
        int expected = 8;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    //Тест для покрытия 100% при переборе станций вверх
    @Test
    public void shouldNextStationRangeUpOver() {
        Radio next = new Radio();
        next.setStationUp(-1);
        int expected = 0;
        int actual = next.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    //Громкость - регулировка вниз
    @Test
    public void shouldIncreaseVolumeDown() {
        Radio volume = new Radio();
        volume.increaseVolumeDown(8);
        int expected = 7;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }
    //Тест для покрытия 100% по регулировке громкости вниз
    @Test
    public void shouldIncreaseVolumeDownOver() {
        Radio volume = new Radio();
        volume.increaseVolumeDown(11);
        int expected = 11;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    //Регулировка вверх
    @Test
    public void shouldIncreaseVolumeUp() {
        Radio volume = new Radio();
        volume.increaseVolumeUp(3);
        int expected = 4;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }
    //Тест для покрытия 100% по регулировке громкости вверх
    @Test
    public void shouldIncreaseVolumeUpOver() {
        Radio volume = new Radio();
        volume.increaseVolumeUp(-2);
        int expected = -2;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    //Проверка границ вверх и вниз
    @Test
    public void volumeBorderCheckUp() {
        Radio volume = new Radio();
        volume.incorrectVolume(11);
        int expected = 10;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void volumeBorderCheckDown() {
        Radio volume = new Radio();
        volume.incorrectVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }
}
