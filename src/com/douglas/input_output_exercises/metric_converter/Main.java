package com.douglas.input_output_exercises.metric_converter;

    /*
        Escreva um programa que realiza conversão de medidas de polegadas em centímetros.
    */


import com.douglas.input_output_exercises.metric_converter.utils.Printer;
import com.douglas.input_output_exercises.utils.ScannerInput;

public class Main {
    public static void main(String[] args) {

        convertInchesToCentimeters();

    }

    private static void convertInchesToCentimeters(){
        ScannerInput.open();

        float inches;

        Printer.requestInchesValue();

        while (ScannerInput.hasNext()){
            inches = ScannerInput.nextFloat();
            Printer.showResult(inches);
            Printer.requestInchesValue();
            Printer.informExitMethod();
        }
        ScannerInput.close();
    }
}
