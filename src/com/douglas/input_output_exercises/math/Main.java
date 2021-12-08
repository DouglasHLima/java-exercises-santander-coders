package com.douglas.input_output_exercises.math;

        /*
        Enunciado
        Escreva um programa que recebe dois números inteiros e informa o
        resultado das operações soma, subtração, multiplicação
        e divisão. Considere sempre a ordem em que foram informados.
        */

import com.douglas.input_output_exercises.math.utils.ConsoleTexts;
import com.douglas.utils.ScannerInput;


public class Main {
    public static void main(String[] args) {
        performAllOperations();
    }

    private static void performAllOperations(){
        ScannerInput.open();
        int[] numbersToCalculate = new int[2];

        ConsoleTexts.requestFirstNumber();
        ConsoleTexts.informExitMethod();

        while (ScannerInput.hasNext()){
            numbersToCalculate[0] = ScannerInput.nextInt();
            ConsoleTexts.requestSecondNumber();
            numbersToCalculate[1] = ScannerInput.nextInt();
            ConsoleTexts.showAllResults(numbersToCalculate[0],numbersToCalculate[1]);
            System.out.println("--------------------------------------------------");
            ConsoleTexts.requestFirstNumber();
            ConsoleTexts.informExitMethod();
        }
        ScannerInput.close();
    }
}


