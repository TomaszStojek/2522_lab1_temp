
package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Window is used to practice importing and using Papplet library.
 *
 * @author Tomasz Stojek
 * @version 1.0
 */
public class Window extends PApplet {
  public void settings() {
    size(500, 500);
  }

  /**
   * Draws an icecream cone dinner.
   */
  public void draw() {
    ellipse(250, 350, 400, 200);
    ellipse(250, 350, 200, 100);
    circle(250, 100, 100);
    circle(200, 175, 100);
    circle(300, 175, 100);
    triangle(180, 225, 320, 225, 250, 400);
    line(185, 230, 315, 230);
    square(220, 180, 10);
    square(200, 190, 10);
    square(190, 160, 10);
    square(165, 195, 10);
  }

  public void mousePressed() {
    background(64);
  }

  /**
  * Drives the program.
  *
  * @param args is unused.
  */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}