package drawing.drivers;

public abstract class AbstractDrawingDriver {
    public abstract void drawLine(int x, int y) throws Exception;
    public abstract void drawCircle(int x, int y, int radius) throws Exception;
}
