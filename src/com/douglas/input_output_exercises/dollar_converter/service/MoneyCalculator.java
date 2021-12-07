package com.douglas.input_output_exercises.dollar_converter.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyCalculator {



    public static BigDecimal convertBRLToUSD(BigDecimal brlAmount, BigDecimal usdCurrencyValue){
        return brlAmount.divide(usdCurrencyValue,2, RoundingMode.HALF_UP);
    }

}
