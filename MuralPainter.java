import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  // code written by Arman period 2 
  public void paintLine(String color, int spaces) {
    int space = spaces;
    while (space>0){
      paint(color);

      if (canMove()){
        move();
      }
      space = space - 1;
      }
    }

//Moves based on specific amount of steps wanted
//
  public void moveSpaces (int spaces) {
    int steps = spaces;
    while (steps > 0) {
      if (canMove()) {
        move(); //move on space
        
      }
      steps = steps -1;
    }
  }


  
  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}