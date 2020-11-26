package forms;/*
 * forms.Triangle.java
 */

import forms.AbstractDrawableForm;

/**
 * Raffinement de l'abstraction (RefinedAsbtraction)
 */
public class Triangle extends AbstractDrawableForm {
  private int x;
  private int y;
  private int z;
  
  public Triangle(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * We need this to work on Windows and OSX
   */
  public void drawForm() {
      System.out.println("ToBeDone");
  }
  
}
