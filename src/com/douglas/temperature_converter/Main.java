package com.douglas.temperature_converter;

import com.douglas.temperature_converter.utils.ConsoleTexts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        convertCelsiusToAll();

    }

    private static void convertCelsiusToAll(){
        float celsius;
        Scanner input = new Scanner(System.in);

        ConsoleTexts.askToInputACelsiusValue();

        while(input.hasNext()){
            celsius = input.nextFloat();
            ConsoleTexts.printAllResultsOfConversions(celsius);
            ConsoleTexts.askToInputNewValueOrCancel();
        }
        input.close();
    }
}
