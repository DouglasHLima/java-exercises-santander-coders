package com.douglas.array_loops.odd_char_uppercase;

import com.douglas.utils.ScannerInput;

public class OddCharUppercaseApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        ScannerInput.open();
        System.out.println("digite um nome: ");
        while(ScannerInput.hasNext()) {
            char[] charName = ScannerInput.nextCharArray();
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < charName.length; i++) {
                if (i % 2 == 0) {
                    name.append(String.valueOf(charName[i]).toUpperCase());
                } else {
                    name.append(String.valueOf(charName[i]).toLowerCase());
                }
            }

            System.out.println("resultado: " + name);
            System.out.println("digite um novo nome ou ctrl+D para sair");
        }
        ScannerInput.close();
    }
}
