package forms;/*
 * forms.Triangle.java
 */

import drawing.drivers.AbstractDrawingDriver;
import forms.AbstractDrawableForm;

/**
 * Raffinement de l'abstraction (RefinedAsbtraction)
 */
public class Triangle extends AbstractDrawableForm {
  private int x;
  private int y;
  private int z;
  
  public Triangle(AbstractDrawingDriver drawingDriver, int x, int y, int z) {
    super(drawingDriver);
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * We need this to work on Windows and OSX
   */
  public void drawForm() throws Exception {
      this.drawingDriver.drawLine(this.x, this.y);
      this.drawingDriver.drawLine(this.y, this.z);
      this.drawingDriver.drawLine(this.z, this.x);


  }
  
}
