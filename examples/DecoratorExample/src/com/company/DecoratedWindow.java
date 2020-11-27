package com.company;

public class DecoratedWindow implements Window {
    /**
     * private reference to the window being decorated
     */
    private Window privateWindowReference = null;

    public DecoratedWindow(Window windowRefernce) {
        this.privateWindowReference = windowRefernce;
    }

    @Override
    public void renderWindow() {
        privateWindowReference.renderWindow();
    }
}
