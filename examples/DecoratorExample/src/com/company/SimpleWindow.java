package com.company;

/**
 * Window implementation
 * <p>
 * Concrete implementation
 */
public class SimpleWindow implements Window {

    private int width;

    public SimpleWindow(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void renderWindow() {
        // implementation of rendering details

        String display = "" +
                "+"+ "-".repeat(width) + "+\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "|"+ " ".repeat(width) + "|\n" +
                "+"+ "-".repeat(width) + "+";

        System.out.println(display);
    }
}
