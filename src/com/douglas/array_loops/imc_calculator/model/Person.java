package com.douglas.array_loops.imc_calculator.model;

public class Person {
    String name;
    float height;
    float weight;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public float getImc(){
        return (float)(this.weight / Math.pow(this.height,2));
    }


}
