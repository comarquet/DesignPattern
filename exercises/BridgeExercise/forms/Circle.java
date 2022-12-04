package forms;/*
 * Cercle.java
 */

import forms.AbstractDrawableForm;

/**
 */
public class Circle extends AbstractDrawableForm {
  private int x;
  private int y;
  private int r;
  
  public Circle(int x, int y, int r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  
  public void drawForm() {
    System.out.println("ToBeDone");
  }
  
}
