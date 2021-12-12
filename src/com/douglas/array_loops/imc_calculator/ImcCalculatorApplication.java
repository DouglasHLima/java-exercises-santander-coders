package com.douglas.array_loops.imc_calculator;

import com.douglas.array_loops.imc_calculator.model.Person;
import com.douglas.utils.ScannerInput;

import java.util.Scanner;

public class ImcCalculatorApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        final float IMC_MIN = 18.5f;
        final float IMC_MAX = 25f;
        Person[] persons = new Person[5];
        String name;
        float weight;
        float height;

        ScannerInput.open();

        System.out.println("Insira Nomes, peso e Altura de 5 pessoas!");

        for(int i = 0; i < persons.length; i++){

            System.out.printf("Insira o nome da Pessoa Nº%d: ",(i+1));
            name = ScannerInput.next();
            System.out.printf("Insira a altura de %s: ",name);
            height = ScannerInput.nextFloat();
            System.out.printf("Insira o peso de %s: ",name);
            weight = ScannerInput.nextFloat();
            persons[i] = new Person(name,height,weight);
        }

        for (Person person : persons){
            System.out.printf("O IMC de %s é %.1f %n", person.getName(),person.getImc());
            if (person.getImc() < IMC_MIN || person.getImc() > IMC_MAX){
                System.out.printf("E está fora do ideal %n");
            }else{
                System.out.printf("E está dentro do ideal %n");
            }
        }

        ScannerInput.close();
    }
}
