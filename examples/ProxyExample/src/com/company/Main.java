package com.company;

import com.solution.AbstractCalculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //CalculatorBase calculator = new CalculatorCacheProxy(new Calculator());

        for (int i = 0; i < 10; i++) {
            System.out.println(calculator.getPrimeNumberFactors(665116545601L));
        }
    }
}