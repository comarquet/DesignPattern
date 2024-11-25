package com.solution;

import com.company.Calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorCacheProxy extends AbstractCalculator {
    private Calculator realCalculator;
    private Map<Long, List<Long>> cachedResults = new HashMap<>();

    public CalculatorCacheProxy(Calculator realCalculator) {
        this.realCalculator = realCalculator;
    }

    @Override
    public List<Long> getPrimeNumberFactors(Long n) {
        if (this.cachedResults.containsKey(n)) {
            /* If we already have the result in cache, simply return it and do not
                compute for real
             */
            return this.cachedResults.get(n);
        } else {
            /**
             * If we do not have the cached result, call the calculator, and store
             * the result in cache before returning it
             */
            List<Long> result = this.realCalculator.getPrimeNumberFactors(n);
            this.cachedResults.put(n, result);
            return result;
        }
    }

}
