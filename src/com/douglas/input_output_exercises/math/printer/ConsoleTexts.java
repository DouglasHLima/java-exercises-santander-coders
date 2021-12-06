package com.douglas.input_output_exercises.math.printer;

import com.douglas.input_output_exercises.math.calculator.Calculator;

public class ConsoleTexts {

    public static void requestFirstNumber() {
        System.out.println("Digite o primeiro número");
    }
    public static void requestSecondNumber(){
        System.out.println("Digite o segundo número");
    }
    public static void informExitMethod(){
        System.out.println("ou digite Ctrl+D para sair");
    }

    public static void showAllResults(int firstNumber, int secondNumber){
        System.out.printf("números inseridos: %s e %s %n" +
                        "A soma é: %s%n" +
                        "A subtração é: %s%n" +
                        "A multiplicação é: %s%n" +
                        "A divisão é: %.2f%n",
                firstNumber,
                secondNumber,
                Calculator.sum(firstNumber,secondNumber),
                Calculator.subtract(firstNumber,secondNumber),
                Calculator.multiply(firstNumber,secondNumber),
                Calculator.divide(firstNumber,secondNumber));

    }
}
