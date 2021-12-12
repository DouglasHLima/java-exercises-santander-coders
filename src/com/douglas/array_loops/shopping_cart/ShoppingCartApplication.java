package com.douglas.array_loops.shopping_cart;

import com.douglas.utils.ScannerInput;

import java.util.Scanner;

public class ShoppingCartApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        ScannerInput.open();
        System.out.println("insira 5 frutas, separadas por espaço");
        String[] shoppingCart = ScannerInput.nextArrayLine(5);

        for(int i = 0; i < shoppingCart.length; i++){
            System.out.println((i+1) +": " + shoppingCart[i]);
        }
        ScannerInput.close();
    }
}
