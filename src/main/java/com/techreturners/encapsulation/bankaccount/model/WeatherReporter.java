package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;


    private final double NINE =9.0;
    private final double FIVE=5.0;
    private final int NUM32=32;


    private final String TOOHOT="It's too hot 🥵!";
    private final String TOOCOLD="It's too cold 🥶!";
    private final String NORMAL="Ahhh...it's just right 😊!";

    private final int UPPER =30;
    private final int LOWER =10;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getTemperatureFahrenheit() {


        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, getLocationEmoji(), getTemperaturePhrase(), (( NINE/ FIVE) * temperature + NUM32));

    }

    public String getLocationEmoji() {

        return switch (location) {
            case "London"                    -> "🌦";
            case "California"                -> "🌅";
            case "Cape Town"                 -> "🌤";
            default -> "🔆";
        };

    }

    public String getTemperaturePhrase() {
        if (temperature > UPPER)
        {return TOOHOT;}
        else if (temperature < LOWER) {
            return TOOCOLD;
        }
        return NORMAL;
        }

}
