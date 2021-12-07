package com.douglas.input_output_exercises.dollar_converter.utils;

import com.douglas.input_output_exercises.dollar_converter.service.MoneyCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Printer {
    private static final Locale LOCALE_BR = new Locale("pt","BR");
    private static final Locale LOCALE_EU = new Locale("en","US");

    private static final NumberFormat BRL = NumberFormat.getCurrencyInstance(LOCALE_BR);
    private static final NumberFormat USD = NumberFormat.getCurrencyInstance(LOCALE_EU);

    public static String formatToBRL(BigDecimal currencyValue){
        return BRL.format(currencyValue);
    }
    public static String formatToUSD(BigDecimal currencyValue){return USD.format(currencyValue); }

    public static void requestUSDCurrencyValue(){
        System.out.println("insira a cotação do dolar hoje");
    }

    public static void informExitMethod(){
        System.out.println(" ou digite ctrl+D para sair");
    }

    public static void requestBRLAmount(){
        System.out.println("insira a quantia em reais para converter");
    }

    public static void showResults(BigDecimal dollarValue, BigDecimal amountToConvert){
        System.out.printf("o valor da cotação do dólar inserido é de: %s%n" +
                        "o valor em reais inserido é de : %s%n" +
                        "o valor correspondente em doláres é: %s%n%n",
                USD.format(dollarValue),
                BRL.format(amountToConvert),
                USD.format(MoneyCalculator.convertBRLToUSD(amountToConvert,dollarValue))
        );
    }
}
