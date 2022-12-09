package com.company;

public abstract class AbstractDecoratedWindow extends AbstractWindow {
    /**
     * private reference to the window being decorated
     */
    protected AbstractWindow windowReference = null;

    public AbstractDecoratedWindow(AbstractWindow windowReference) {
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
