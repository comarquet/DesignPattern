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

      Circle c = new Circle(2, 3, 5);
      Triangle t = new Triangle(2, 7, 1);


      c.drawForm();
      t.drawForm();
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  
}
