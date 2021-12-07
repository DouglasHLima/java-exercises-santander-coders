package com.douglas.input_output_exercises.utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerInput  {
    private static Scanner input;

    public static void open(){
        input = new Scanner(System.in);
    }

    public static void close(){
        input.close();
    }


    public static float nextFloat(){
        return input.nextFloat();
    }

    public static int nextInt(){
        return input.nextInt();
    }

    public static BigDecimal nextBigDecimal(){
        return input.nextBigDecimal();
    }

    public static boolean hasNext(){
        return input.hasNext();
    }
}
