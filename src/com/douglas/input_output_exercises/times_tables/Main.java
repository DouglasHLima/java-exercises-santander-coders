package com.douglas.input_output_exercises.times_tables;

    /*
        Enunciado
        Escreva um programa que informa a tabuada de um número informado (entre 1-10).
    */

import com.douglas.input_output_exercises.utils.ScannerInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        generateTimesTables();
    }
    private static void generateTimesTables(){
        final String MESSAGE = "insira um numero para fazer a tabuada ou ctrl+D para sair";
        int number;

        ScannerInput.open();

        System.out.println(MESSAGE);

        while (ScannerInput.hasNext()){

            number = ScannerInput.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.printf("%s X %s = %s %n",i,number,i*number);
            }
            System.out.println(MESSAGE);
        }
    }


}
