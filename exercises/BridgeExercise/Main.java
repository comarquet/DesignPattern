import drawing.drivers.AbstractDrawingDriver;
import drawing.drivers.OSXDrawingDriver;
import drawing.drivers.WindowsDrawingDriver;
import forms.Circle;
import forms.Triangle;
import system.SystemInfo;
import system.SystemOS;

/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    try {
      SystemOS mySystem = SystemInfo.getCurrentOS();


      /* The system is determined at run time, this program needs to work with mySystem string
       * having "Windows" or "OSX" as value.
       *
       * The forms forms.Circle and forms.Triangle need to draw themselves using a low lever system
       * driver that allow to draw lines and circles.
       *
       * If the system is Windows, only the drawing.drivers.WindowsDrawingDriver will work. If the system is
       * OSX, only the drawing.drivers.OSXDrawingDriver works.
       *
       * Use the Bridge pattern to implement a solution to this problem.
       */
      AbstractDrawingDriver drawingDriver;
      if (mySystem == SystemOS.OSX) {
        drawingDriver = new OSXDrawingDriver();
      } else {
        drawingDriver = new WindowsDrawingDriver();
      }


      Circle c = new Circle(drawingDriver, 2, 3, 5);
      Triangle t = new Triangle(drawingDriver, 2, 7, 1);


      c.drawForm();
      t.drawForm();
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  
}
