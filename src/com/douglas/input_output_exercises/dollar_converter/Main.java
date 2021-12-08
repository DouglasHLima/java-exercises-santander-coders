package com.douglas.input_output_exercises.dollar_converter;

    /*
    Enunciado:
    Escreva um programa que recebe a cotação do dólar do dia e,
    seguida recebe um valor em reais. A saída é a quantia em dólares.
    Use formatação de saída para
    exibir os valores de acordo com cada representação de moeda.
    */

import com.douglas.input_output_exercises.dollar_converter.utils.Printer;
import com.douglas.utils.ScannerInput;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        convertBRLToDollar();
    }

    private static void convertBRLToDollar(){
        BigDecimal dollarValue;
        BigDecimal amountToConvert;

        ScannerInput.open();

        Printer.requestUSDCurrencyValue();
        Printer.informExitMethod();

        while(ScannerInput.hasNext()){

            dollarValue = ScannerInput.nextBigDecimal();
            Printer.requestBRLAmount();
            amountToConvert = ScannerInput.nextBigDecimal();
            Printer.showResults(dollarValue,amountToConvert);

            Printer.requestUSDCurrencyValue();
            Printer.informExitMethod();
        }

        ScannerInput.close();

    }

}


