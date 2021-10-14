package com.company;

public class Main {

    public static void main(String[] args) {
        CalculatorBase calculator = new Calculator();

        for (int i = 0; i < 10; i++) {
            System.out.println(calculator.calculate());
        }
    }



    /** Solution */
//    public static void main(String[] args) {
//        NumberMultiplier calculator = new NumberMultiplier();
//
//        CalculatorBase calculatorCachedProxy = new NumberMultiplierProxy(calculator);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(calculatorCachedProxy.calculate());
//        }
//    }
}