package com.solution;

import com.company.Window;

public class DecoratedWindow implements Window {
    /**
     * private reference to the window being decorated
     */
    protected Window windowReference = null;

    public DecoratedWindow(Window windowReference) {
        this.windowReference = windowReference;
    }

    @Override
    public int getWidth() {
        return this.windowReference.getWidth();
    }

    @Override
    public void renderWindow() {
        windowReference.renderWindow();
    }
}
