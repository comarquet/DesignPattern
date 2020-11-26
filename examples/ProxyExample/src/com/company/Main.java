package com.company;

public class Main {

    public static void main(String[] args) {
        CalculatorBase cb = new NumberMultiplierProxy();

        for (int i = 0; i < 10; i++) {
            System.out.println(cb.calculate());
        }
    }
}


