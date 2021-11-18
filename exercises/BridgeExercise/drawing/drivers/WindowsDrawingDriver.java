package drawing.drivers;/*
 * WindowsAPI.java
 */


import system.SystemInfo;
import system.SystemOS;

/**
 * This is the service that allows to draw basic forms on Windows platform
 */
public class WindowsDrawingDriver extends AbstractDrawingDriver {

  public void drawLine(int x, int y) throws Exception {
    this.checkOS();
    System.out.println("Win : Line (" + x + ", " + y + ")");
  }

  public void drawCircle(int x, int y, int radius) throws Exception {
    this.checkOS();
    System.out.println("Win : forms.Circle (" + x + ", " + y + ") r = " + radius);
  }

  private void checkOS() throws Exception {
    if (SystemInfo.getCurrentOS() != SystemOS.WINDOWS) {
      throw new Exception("Wrong OS !");
    }
  }
}
