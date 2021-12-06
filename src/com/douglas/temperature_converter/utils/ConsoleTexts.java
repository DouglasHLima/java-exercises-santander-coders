package com.douglas.temperature_converter.utils;

import com.douglas.temperature_converter.service.CelsiusConverter;

public class ConsoleTexts {

    public static void askToInputACelsiusValue(){
        System.out.printf("Digite um valor em Celsius para converter ou crtl+D para sair %n");
    }

    public static void askToInputNewValueOrCancel(){
        System.out.printf("Digite um novo valor em Celsius para converter ou crtl+D para sair %n");
    }

    public static void printCelsiusInputedValue(float celsius){
        System.out.printf(
                "O valor em celsius inserido é: %.2fºC.%n",celsius);
    }
    public static void printFahrenheitConversionValue(float celsius){
        System.out.printf(
                "O valor em Fahrenheit é %.2fºF.%n",CelsiusConverter.toFahrenheit(celsius));
    }
    public static void printKelvinConversionValue(float celsius){
        System.out.printf(
                "O valor em Kelvin é %.2fºK.%n",CelsiusConverter.toKelvin(celsius));
    }
    public static void printReaumurConversionValue(float celsius){
        System.out.printf(
                "O valor em Reaumur é %.2fºRe.%n",CelsiusConverter.toReaumur(celsius));
    }
    public static void printRankineConversionValue(float celsius){
        System.out.printf(
                "O valor em Rankine é %.2fºRa.%n",CelsiusConverter.toRankine(celsius));
    }

    public static void printAllResultsOfConversions(float celsius) {
        printCelsiusInputedValue(celsius);
        printFahrenheitConversionValue(celsius);
        printKelvinConversionValue(celsius);
        printReaumurConversionValue(celsius);
        printRankineConversionValue(celsius);
    }
}
