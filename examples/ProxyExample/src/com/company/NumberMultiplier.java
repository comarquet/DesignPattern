package com.company;

public class NumberMultiplier extends CalculatorBase {
    @Override
    public int calculate() {
        int result = 1;

        for (int i = 2; i <= 10; i++) {
            result *= i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
