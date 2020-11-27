package forms;

import drawing.drivers.DrawingDriverInterface;

public abstract class AbstractDrawableForm {
    protected DrawingDriverInterface drawingDriver;

    public AbstractDrawableForm(DrawingDriverInterface drawingDriver) {
        this.drawingDriver = drawingDriver;
    }

    public void setDrawingDriver(DrawingDriverInterface drawingDriver) {
        this.drawingDriver = drawingDriver;
    }

    abstract public void drawForm() throws Exception;
}
