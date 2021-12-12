package com.douglas.array_loops.age_average;

import com.douglas.array_loops.age_average.model.Person;
import com.douglas.utils.ScannerInput;

import java.util.Scanner;

public class AgeAverageApplication {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Person[] persons = new Person[5];
        ScannerInput.open();
        int sumOfAges = 0;
        Person newest;
        Person oldest;

        System.out.println("insira os nomes e idades de 5 pessoas");
        for(int i = 0; i < persons.length; i++){
            System.out.printf("insira um nome para a pessoa nº%d: ",(i+1));
            String name = ScannerInput.next();
            System.out.printf("Insira a idade de %s: ",name);
            int age = ScannerInput.nextInt();
            persons[i] = new Person(name,age);
        }
        newest = persons[0];
        oldest = persons[0];

        for(Person person: persons){
            sumOfAges += person.getAge();
            newest = person.getAge() < newest.getAge() ? person : newest;
            oldest = person.getAge() > oldest.getAge() ? person : oldest;
        }
        System.out.printf(
                "A pessoa mais nova é: %s com %d anos.%n" +
                "A pessoa mais velha é: %s com %d anos.%n" +
                "A média de idade é de %.2f anos",
                newest.getName(),newest.getAge(),
                oldest.getName(),oldest.getAge(),
                ( (float) sumOfAges / persons.length));

        ScannerInput.close();
    }
}
