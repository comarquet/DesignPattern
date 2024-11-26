package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AbstractCalculator calculator = new Calculator();
        //AbstractCalculator calculator = new CalculatorCacheProxy(new Calculator());

        for (int i = 0; i < 10; i++) {
            System.out.println(calculator.getPrimeNumberFactors(665116545601L));
        }
    }
}