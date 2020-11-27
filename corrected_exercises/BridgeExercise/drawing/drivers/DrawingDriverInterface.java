package drawing.drivers;

public interface DrawingDriverInterface {

    public void drawLine(int x, int y) throws Exception;
    public void drawCircle(int x, int y, int radius) throws Exception;

}