package com.douglas.array_loops.highest_minor_average;

import com.douglas.utils.ScannerInput;

public class HighestMinorAverageApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        int[] numbers;
        int highest;
        int lower;
        int sum = 0;

        ScannerInput.open();
        System.out.println("insira 5 números");
        numbers = ScannerInput.nextLineIntArray(5);
        highest = numbers[0];
        lower = numbers[0];

        for (int number : numbers){
            highest = Math.max(highest,number);
            lower = Math.min(lower,number);
            sum += number;
        }
        System.out.println("O maior valor é: " + highest);
        System.out.println("O menor valor é: " + lower);
        System.out.println("A média é: " + ( sum / numbers.length ));

        ScannerInput.close();
    }
}
