package com.douglas.programming_structures_exercises.print_the_odds;

/*
 Escreva um programa que carregue dois valores A e B
 pelo teclado e imprima todos os números
 ímpares entre A e B.

 */

import com.douglas.utils.ScannerInput;


public class Main {
    public static void main(String[] args) {

        printTheOdds();

    }

    private static void printTheOdds(){
        int[] range;
        ScannerInput.open();
        System.out.println("insira o range de números separados por espaço");

        while(ScannerInput.hasNext()) {
            range = ScannerInput.nextLineIntArray();

            for (int i = range[0]; i <= range[(range.length - 1)]; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            System.out.println("insira o range de números separados por espaço ou ctrl+D para sair");
        }
        ScannerInput.close();
    }
}

