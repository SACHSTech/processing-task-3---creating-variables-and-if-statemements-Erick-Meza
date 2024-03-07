import processing.core.PApplet;

public class Sketch extends PApplet {

  // Initializes variables with random value
  float fltRandomXValue = random(15, 360);
  float fltRandomYValue = random(130, 390);

  /**
   * Creates the sizing constraints for the window screen
   */
  public void settings() {
	// put your size call here
    size(620, 400);
  }
    /**
   * Creates the shapes and time shown on the window screen
   */
  public void draw() {
    
    // Creates a conditional selective algorithm to determine what to execute based on the random variables' values
    if ((fltRandomXValue < 310 && fltRandomYValue < 200) || (fltRandomXValue > 310 && fltRandomYValue > 200)) {

      // Sets the colour of the background
      background(0,0,0);

      // Creates a red triangle in relation to the random width and height
      stroke(255,0,0);
      fill(0,0,0,0);
      triangle(fltRandomXValue, fltRandomYValue, fltRandomXValue, fltRandomYValue - 120, fltRandomXValue + 100, fltRandomYValue - 60);
      
      // Creates a white ellipse in relation to the random variables
      stroke(255,255,255);
      fill(0,0,0,0);
      ellipse(fltRandomXValue + 110, fltRandomYValue - 60, 140, 120);

      // Creates a blue diamond in relation to the width and height variables
      stroke(0,0,255);
      fill(0,0,0,0);
      quad(fltRandomXValue + 130, fltRandomYValue - 60, fltRandomXValue + 190, fltRandomYValue - 120, fltRandomXValue + 250, fltRandomYValue - 60, fltRandomXValue + 190, fltRandomYValue);

      // initializes variables for the current time
      int intHours = hour();
      int intMinutes = minute();
      int intSeconds = second();

      // Outputs the live time on the screen
      fill(255,255,255);
      text(intHours + " : " + intMinutes + " : " + intSeconds, 550, 380);
    }

    // Creates an additional condition in the event the original constraints are not met
    else {

      // Sets the colour of the background
      background(255,255,255);

      // Outputs a blue triangle using the random variables initialized
      stroke(0,0,255);
      fill(0,0,0,0);
      triangle(fltRandomXValue, fltRandomYValue, fltRandomXValue, fltRandomYValue - 120, fltRandomXValue + 100, fltRandomYValue - 60);

      // Creates a black ellipse in relation to the width and height variables
      stroke(0,0,0);
      fill(0,0,0,0);
      ellipse(fltRandomXValue + 110, fltRandomYValue - 60, 140, 120);

      // Creates a red diamond based on the random variables
      stroke(255,0,0);
      fill(0,0,0,0);
      quad(fltRandomXValue + 130, fltRandomYValue - 60, fltRandomXValue + 190, fltRandomYValue - 120, fltRandomXValue + 250, fltRandomYValue - 60, fltRandomXValue + 190, fltRandomYValue);

      // Initializes variables to store the current time
      int intHours = hour();
      int intMinutes = minute();
      int intSeconds = second();
      
      // Outputs the current time
      fill(0,0,0);
      text(intHours + " : " + intMinutes + " : " + intSeconds, 550, 380);
    } 
  }
}