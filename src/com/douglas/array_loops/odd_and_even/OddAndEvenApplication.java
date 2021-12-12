package com.douglas.array_loops.odd_and_even;

import com.douglas.utils.ScannerInput;

import java.util.ArrayList;
import java.util.List;

public class OddAndEvenApplication {
    public static void main(String[] args) {
        start();
    }
    private static void start(){
        ScannerInput.open();

        System.out.println("insira 5 números separados por espaço");
        while (ScannerInput.hasNext()){

            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();

            int[] numbers = ScannerInput.nextLineIntArray(5);
            for(Integer number : numbers) {
                if (number % 2 == 0) odds.add(number);
                else evens.add(number);
            }
            System.out.println("números pares: " + odds);
            System.out.println("números impares: " + evens);
            System.out.println("para continuar digite mais 5 números ou CTRL+D para sair");
        }
        ScannerInput.close();
    }
}
