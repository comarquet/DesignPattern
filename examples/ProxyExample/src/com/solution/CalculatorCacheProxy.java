package com.solution;

import com.company.Calculator;
import com.company.CalculatorBase;

public class CalculatorCacheProxy extends CalculatorBase {
    private Calculator realCalculator;
    private int cachedValue;
    private boolean hasCachedValue = false;

    public CalculatorCacheProxy(Calculator realCalculator) {
        this.realCalculator = realCalculator;
    }

    @Override
    public int calculate() {
        if (!this.hasCachedValue) {
            return this.cachedValue;
        } else {
            this.cachedValue = realCalculator.calculate();
            return this.cachedValue;
        }
    }

}
