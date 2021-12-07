package com.douglas.input_output_exercises.metric_converter.services;

public class MetricConverter {

    public static float inchesToCentimeters(float inches){
        final float INCHES_TO_CENTIMETERS_FACTOR = 2.54f;
        return inches*INCHES_TO_CENTIMETERS_FACTOR;
    }
}
