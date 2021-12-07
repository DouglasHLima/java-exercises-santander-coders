package com.douglas.input_output_exercises.metric_converter.utils;

import com.douglas.input_output_exercises.metric_converter.services.MetricConverter;

public class Printer {

    public static void requestInchesValue(){
        System.out.println("insira o valor em polegadas que deseja converter");
    }

    public static void showResult(float inches){
        System.out.printf("%s pol equivale a %s cm%n",inches, MetricConverter.inchesToCentimeters(inches));
    }

    public static void informExitMethod(){
        System.out.println("ou digite CTRL+D para sair");
    }
}
