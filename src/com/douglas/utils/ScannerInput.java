package com.douglas.utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerInput  {
    private static Scanner input;

    public static void open(){
        input = new Scanner(System.in);
    }

    public static void close(){
        input.close();
    }

    public static String[] nextArrayLine(){
        return input.nextLine().split(" ");
    }
    public static String[] nextArrayLine(int size){
        String[] line = input.nextLine().split(" ");
        while (line.length != size){
            System.out.printf("foi inserido %d valores, é necessário %d valores, tente novamente.%n",
                    line.length,size);
            line = input.nextLine().split(" ");
        }
        return line;
    }
    public static String next(){
        return input.next();
    }

    public static char[] nextCharArray(){
        String word = input.nextLine();
        return word.toCharArray();
    }


    public static int[] nextLineIntArray(){
        String[] lineInputed = nextArrayLine();
        int[] intArray = new int[lineInputed.length];

        for(int i = 0; i < lineInputed.length; i++) {
            try{
                intArray[i] = Integer.parseInt(lineInputed[i]);
            }
            catch (Exception error){
                System.out.println("Unable to parse string to int: " + error.getMessage());
            }
        }
        return intArray;
    }
    public static int[] nextLineIntArray(int size){
        String[] lineInputed = nextArrayLine();
        while(lineInputed.length != size){
            System.out.printf("são necessários %d valores, foram inseridos %d, tente novamente: %n",
                    size, lineInputed.length);
            lineInputed = nextArrayLine();
        }
        int[] intArray = new int[lineInputed.length];

        for(int i = 0; i < lineInputed.length; i++) {
            try{
                intArray[i] = Integer.parseInt(lineInputed[i]);
            }
            catch (Exception error){
                System.out.println("Unable to parse string to int: " + error.getMessage());
            }
        }
        return intArray;
    }

    public static float nextFloat(){
        return input.nextFloat();
    }

    public static int nextInt(){
        return input.nextInt();
    }

    public static BigDecimal nextBigDecimal(){
        return input.nextBigDecimal();
    }

    public static boolean hasNext(){
        return input.hasNext();
    }
}
