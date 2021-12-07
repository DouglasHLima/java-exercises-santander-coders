package com.douglas.input_output_exercises.times_tables;

    /*
        Enunciado
        Escreva um programa que informa a tabuada de um número informado (entre 1-10).
    */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        generateTimesTables();
    }
    private static void generateTimesTables(){
        final String MESSAGE = "insira um numero para fazer a tabuada ou ctrl+D para sair";
        int number;

        Scanner inputScan = new Scanner(System.in);

        System.out.println(MESSAGE);

        while (inputScan.hasNext()){

            number = inputScan.nextInt();

            for(int i = 0; i <= 10; i++){
                System.out.printf("%s X %s = %s %n",i,number,i*number);
            }
            System.out.println(MESSAGE);
        }
    }


}
