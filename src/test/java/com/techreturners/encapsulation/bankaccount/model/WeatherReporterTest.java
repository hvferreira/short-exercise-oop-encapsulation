package com.techreturners.encapsulation.bankaccount.model;

import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {

    @org.junit.jupiter.api.Test
    void getTemperatureFahrenheit() {
        WeatherReporter weather0 = new WeatherReporter("London",0);
        WeatherReporter weather11 = new WeatherReporter("London",11);

        assertEquals("I am in London and it is \uD83C\uDF26. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 32.",weather0.getTemperatureFahrenheit());
        assertEquals("I am in London and it is \uD83C\uDF26. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 51,8.",weather11.getTemperatureFahrenheit());


    }

    @org.junit.jupiter.api.Test
    void getLocationEmoji() {
        WeatherReporter weatherLondon = new WeatherReporter("London",0);
        WeatherReporter weatherCalifornia = new WeatherReporter("California",11);
        WeatherReporter weatherCapeTown = new WeatherReporter("Cape Town",50);
        WeatherReporter weatherDefault = new WeatherReporter("lisbon",50);

        assertEquals("🌦",weatherLondon.getLocationEmoji());
        assertEquals("🌅",weatherCalifornia.getLocationEmoji());
        assertEquals("🌤",weatherCapeTown.getLocationEmoji());
        assertEquals("🔆",weatherDefault.getLocationEmoji());

    }

    @org.junit.jupiter.api.Test
    void getTemperaturePhrase() {
        WeatherReporter weather0 = new WeatherReporter("London",0);
        WeatherReporter weather11 = new WeatherReporter("London",11);
        WeatherReporter weather50 = new WeatherReporter("London",50);

        assertEquals("It's too cold 🥶!",weather0.getTemperaturePhrase());
        assertEquals("Ahhh...it's just right 😊!",weather11.getTemperaturePhrase());
        assertEquals("It's too hot 🥵!",weather50.getTemperaturePhrase());

    }
}