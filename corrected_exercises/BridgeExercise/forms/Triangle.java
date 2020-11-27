package forms;/*
 * forms.Triangle.java
 */

import drawing.drivers.DrawingDriverInterface;
import forms.AbstractDrawableForm;

/**
 * Raffinement de l'abstraction (RefinedAsbtraction)
 */
public class Triangle extends AbstractDrawableForm {
  private int x;
  private int y;
  private int z;
  
  public Triangle(DrawingDriverInterface drawingDriver, int x, int y, int z) {
    super(drawingDriver);
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * We need this to work on Windows and OSX
   */
  public void drawForm() throws Exception {
    this.drawingDriver.drawLine(x, y);
    this.drawingDriver.drawLine(y, z);
    this.drawingDriver.drawLine(z, x);
  }
  
}
