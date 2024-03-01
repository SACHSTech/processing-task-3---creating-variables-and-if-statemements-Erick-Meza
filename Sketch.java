import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(620, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // initializes variables 
    float fltEllipseWidth = 300;
    float fltEllipseHeight = 190;

    // defines the thickness of the line/shapes
    strokeWeight(12);

    // creates a red triangle in relation to the ellipse
    stroke(255,0,0);
    fill(0,0,0,0);
    triangle(fltEllipseWidth - 210, fltEllipseHeight + 120, fltEllipseWidth - 210, fltEllipseHeight - 120, fltEllipseWidth - 30, fltEllipseHeight + 10);

    // creates a blue diamond in relation to the ellipse
    stroke(0,0,255);
    quad(fltEllipseWidth + 20, fltEllipseHeight + 10, fltEllipseWidth + 140, fltEllipseHeight - 120, fltEllipseWidth + 255, fltEllipseHeight + 10, fltEllipseWidth + 140, fltEllipseHeight + 114);

    // creates a white ellipse in the center
    stroke(255,255,255);
    fill(0,0,0,0);
    ellipse(fltEllipseWidth, fltEllipseHeight, fltEllipseWidth, fltEllipseHeight + 70);

    // draws a blue line in relation to the ellipse
    stroke(0,0,255);
    line(fltEllipseWidth + 20, fltEllipseHeight + 8, fltEllipseWidth + 140, fltEllipseHeight - 120);

    // draws a red line in relation to the ellipse
    stroke(255,0,0);
    line(fltEllipseWidth - 210, fltEllipseHeight - 120, fltEllipseWidth - 30, fltEllipseHeight + 10);

  }
  
  // define other methods down here.
}