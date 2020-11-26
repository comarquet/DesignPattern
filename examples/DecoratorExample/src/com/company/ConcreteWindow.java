package com.company;

public class ConcreteWindow implements Window {

    @Override
    public void renderWindow() {
        System.out.println("I render a concrete window");
    }
}
