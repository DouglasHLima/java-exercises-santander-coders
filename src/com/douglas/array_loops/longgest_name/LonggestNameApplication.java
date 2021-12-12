package com.douglas.array_loops.longgest_name;

import com.douglas.utils.ScannerInput;

public class LonggestNameApplication {
    public static void main(String[] args) {
        start();
    }

    private static  void start(){
        ScannerInput.open();

        System.out.println("insira 5 nomes");
        String[] guests = new String[5];
        String biggestName = "";

        for(int i = 0; i < 5; i++){
            System.out.printf("Convidado n%d :",(i+1));
            guests[i] = ScannerInput.next();
        }
        for (String guest : guests){
            biggestName = guest.toCharArray().length > biggestName.toCharArray().length?
                    guest : biggestName;
        }
        System.out.println("O maior nome é: " + biggestName);
        ScannerInput.close();
    }
}
