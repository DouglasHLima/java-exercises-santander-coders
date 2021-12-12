package com.douglas.array_loops.inverse_words;

import com.douglas.utils.ScannerInput;

public class InverseWordsApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        ScannerInput.open();
        System.out.println("insira a palavra que deseja inverter");
        while(ScannerInput.hasNext()){
            char[] word = ScannerInput.nextCharArray();
            StringBuilder inverseWord = new StringBuilder();
            for(int i = (word.length-1); i>= 0; i--){
                inverseWord.append(word[i]);
            }
            System.out.println("Palavra invertida: " + inverseWord);
            System.out.println("Insira uma nova palavra ou ctrl+D para sair");
        }

    }
}
