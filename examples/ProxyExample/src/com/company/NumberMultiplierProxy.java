package com.company;

public class NumberMultiplierProxy extends CalculatorBase {
    private NumberMultiplier realNumberMultiplier;
    private int cachedValue;
    private boolean hasCachedValue = false;

    public NumberMultiplierProxy(NumberMultiplier realNumberMultiplier) {
        this.realNumberMultiplier = realNumberMultiplier;
    }

    @Override
    public int calculate() {
        if (!this.hasCachedValue) {
            return this.cachedValue;
        } else {
            this.cachedValue = realNumberMultiplier.calculate();
            return this.cachedValue;
        }
    }

}
