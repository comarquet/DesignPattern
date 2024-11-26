package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calculator extends AbstractCalculator {


    /**
     * This function returns the list of prime number factors for the given input number
     * @param n
     * @return
     */
    public List<Long> getPrimeNumberFactors(Long n) {
        ArrayList<Long> resultArray = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                resultArray.add(i);
                n = n / i;
            }
        }
        return resultArray;
    }
}

