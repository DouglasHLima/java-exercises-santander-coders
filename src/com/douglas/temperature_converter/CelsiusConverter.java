package com.douglas.temperature_converter;

public class CelsiusConverter {


    static float toFahrenheit(float celsius){
        final float FAHRENHEIT_CONVERSION_FACTOR = 1.8f;
        final float FAHRENHEIT_VARIANCE = 32f;
        return (celsius * FAHRENHEIT_CONVERSION_FACTOR) + FAHRENHEIT_VARIANCE;
    }

    static float toKelvin(float celsius){
        final float KELVIN_VARIANCE = 273.15f;
        return celsius + KELVIN_VARIANCE;
    }

    static float toReaumur(float celsius){
        final float REAUMUR_CONVERSION_FACTOR = 0.8f;
        return celsius * REAUMUR_CONVERSION_FACTOR;
    }

    static float toRankine(float celsius){
        final float RANKINE_CONVERSION_FACTOR = 1.8f;
        final float RANKINE_VARIANCE = 491f;
        return (celsius * RANKINE_CONVERSION_FACTOR) + RANKINE_VARIANCE;
    }




}
