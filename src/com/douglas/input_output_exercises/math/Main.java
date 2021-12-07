package com.douglas.input_output_exercises.math;

        /*
        Enunciado
        Escreva um programa que recebe dois números inteiros e informa o
        resultado das operações soma, subtração, multiplicação
        e divisão. Considere sempre a ordem em que foram informados.
        */

import com.douglas.input_output_exercises.math.utils.ConsoleTexts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        performAllOperations();
    }

    private static void performAllOperations(){
        Scanner inputScan = new Scanner(System.in);
        int[] numbersToCalculate = new int[2];

        ConsoleTexts.requestFirstNumber();
        ConsoleTexts.informExitMethod();

        while (inputScan.hasNext()){
            numbersToCalculate[0] = inputScan.nextInt();
            ConsoleTexts.requestSecondNumber();
            ConsoleTexts.informExitMethod();
            numbersToCalculate[1] = inputScan.nextInt();
            ConsoleTexts.showAllResults(numbersToCalculate[0],numbersToCalculate[1]);
            System.out.println("--------------------------------------------------");
            ConsoleTexts.requestFirstNumber();
            ConsoleTexts.informExitMethod();
        }
        inputScan.close();
    }
}


