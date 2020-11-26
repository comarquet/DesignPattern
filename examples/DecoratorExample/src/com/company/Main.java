package com.company;

public class Main {

    public static void main(String[] args) {
        // create a new window

        System.out.println("Rendering my concrete window : ");
        Window window = new ConcreteWindow();
        window.renderWindow();
        System.out.println("==============\n\n");

        // at some point later
        // maybe text size becomes larger than the window
        // thus the scrolling behavior must be added

        // decorate old window
        System.out.println("Rendering my concrete window, decorated with scrollbar s: ");
        window = new ScrollableWindow(window);

        //  now window object
        // has additional behavior / state

        window.renderWindow();
    }
}


