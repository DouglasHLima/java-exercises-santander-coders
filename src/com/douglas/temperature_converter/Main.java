package com.douglas.temperature_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConvertCelsiusToAll();

    }

    private static void ConvertCelsiusToAll(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um valor em Celsius para converter ou crtl+D para sair %n");
        while(input.hasNext()){
            float celsius = input.nextFloat();
            System.out.printf(
                    "O valor em celsius inserido é: %.2fºC.%n" +
                    "Em Fahrenheit é %.2fºF.%n" +
                    "Em Kelvin é %.2fºK.%n" +
                    "Em Reaumur é %.2fºRe.%n" +
                    "Em Rankine é %.2fºRa.%n",
                    celsius,
                    CelsiusConverter.toFahrenheit(celsius),
                    CelsiusConverter.toKelvin(celsius),
                    CelsiusConverter.toReaumur(celsius),
                    CelsiusConverter.toRankine(celsius));
            System.out.printf("Digite um novo valor em Celsius para converter ou crtl+D para sair %n");
        }
        input.close();
    }
}
