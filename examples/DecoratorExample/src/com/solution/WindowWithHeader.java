package com.solution;

public class WindowWithHeader extends AbstractDecoratedWindow {

    /**
     * Additional State
     */
    private String windowTitle;

    public WindowWithHeader(AbstractWindow windowReference, String windowTitle) {
        super(windowReference);
        this.windowTitle = windowTitle;
    }

    @Override
    public void renderWindow() {
        // render header
        renderHeader();

        // render decorated window
        super.renderWindow();
    }

    private void renderHeader() {
        // render window header
        String headerDisplay = "" +
                "+"+ "-".repeat(this.windowReference.getWidth()) + "+\n" +
                "| " + String.format("%-" + (this.windowReference.getWidth()-1) + "s", this.windowTitle) + "|";

        System.out.println(headerDisplay);

    }
}
