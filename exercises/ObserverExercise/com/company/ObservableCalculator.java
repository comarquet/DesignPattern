package com.company;

public class ObservableCalculator {
    private int calculatorLastValue;
    private HexDisplay hexObserver = new HexDisplay();
    private OctDisplay octObserver = new OctDisplay();
    private RomanDisplay romanObserver = new RomanDisplay();

    public void setState(int val) {
        calculatorLastValue = val;
        hexObserver.update(calculatorLastValue);
        octObserver.update(calculatorLastValue);
        romanObserver.update(calculatorLastValue);
    }
}
