package forms;/*
 * Cercle.java
 */

import drawing.drivers.DrawingDriverInterface;
import forms.AbstractDrawableForm;

/**
 */
public class Circle extends AbstractDrawableForm {
  private int x;
  private int y;
  private int r;


  public Circle(DrawingDriverInterface drawingDriver, int x, int y, int r) {
    super(drawingDriver);
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public void drawForm() throws Exception {
    this.drawingDriver.drawCircle(x, y, r);
  }
  
}
