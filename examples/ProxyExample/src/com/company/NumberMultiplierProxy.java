package com.company;

public class NumberMultiplierProxy extends CalculatorBase {
    private NumberMultiplier realNumberMultiplier;
    private int cachedValue;

    @Override
    public int calculate() {
        if (realNumberMultiplier == null) {
            realNumberMultiplier = new NumberMultiplier();
            cachedValue = realNumberMultiplier.calculate();
        }

        return cachedValue;
    }
}
