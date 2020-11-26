package com.company;

public class ScrollableWindow extends DecoratedWindow {

    /**
     * Additional State
     */
    private Object scrollBarObjectRepresentation = null;

    public ScrollableWindow(Window windowRefernce) {
        super(windowRefernce);
    }

    @Override
    public void renderWindow() {
        // render scroll bar
        renderScrollBarObject();

        // render decorated window
        super.renderWindow();
    }

    private void renderScrollBarObject() {
        // prepare scroll bar
        scrollBarObjectRepresentation = new Object();
        System.out.println("I render a scrollbar, as an added functionality");
        // render scrollbar
    }
}
