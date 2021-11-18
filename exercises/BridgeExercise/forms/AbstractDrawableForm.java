package forms;

import drawing.drivers.AbstractDrawingDriver;

public abstract class AbstractDrawableForm {
    AbstractDrawingDriver drawingDriver;



    public AbstractDrawableForm(AbstractDrawingDriver drawingDriver) {
        this.drawingDriver = drawingDriver;
    }

    abstract public void drawForm() throws Exception;
}
