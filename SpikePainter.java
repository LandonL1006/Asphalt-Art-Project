import org.code.neighborhood.*;

public class SpikePainter extends MuralPainter {


public void drawSpike() {
  //creates the final product
  drawHat();
  drawBase();
  drawLimeStripes();
  drawDarkStripes();
  drawEyes();
  drawSmile();
  drawFinish();
}

public void drawHat() {
//CREATES INDIANRED HAT
  moveSpaces(13);
  turnRight();
  move();
  move();
  move();
  turnLeft();
  paintLine("indianred", 6);
  move();
  turnRight();
  move();
  turnRight();
  paintLine("indianred", 10);
  move();
  move();
  turnLeft();
  move();
  turnLeft();
  paintLine("indianred", 16);
}

public void drawBase(){
//CREATES the SQUARE structure
  move();
  move();
  turnRight();
  move();
  turnRight();
  paintLine("black", 21);
  paint("black");
  turnLeft();
  paintLine("black", 21);
  paint("black");
  turnLeft();
  paintLine("black", 21);
  paint("black");
  turnLeft();
  paintLine("black", 21);
}

  
public void drawLimeStripes(){
//CREATES TWO 2x20 and TWO 5x20 LIME GREEN COLLUMNS
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
  turnLeft();
  move();
  move();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);  
  turnLeft();
  move();
  move();
  move();
  turnLeft();
  move();
  paintLine("limegreen", 20);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("limegreen", 20);
}

public void drawDarkStripes() {
//CREATES THREE 2x20 DARK GREEN COLLUMNS
  turnRight();
  move();
  move();
  turnRight();
  move();
  paintLine("seagreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("seagreen", 20);
  turnRight();
  moveSpaces(6);
  turnRight();
  move();
  paintLine("seagreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("seagreen", 20);
  turnRight();
  moveSpaces(6);
  turnRight();
  move();
  paintLine("seagreen", 20);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("seagreen", 20); 
}

public void drawEyes() {
//CREATES the RIGHT EYE
  turnLeft();
  move();
  move();
  turnLeft();
  moveSpaces(4);
  turnRight();
  paintLine("black", 3);
  turnLeft();
  move();
  turnLeft();
  paintLine("black",5);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("black",5);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("black",5);
  turnRight();
  move();
  turnRight();
  move();
  move();
  paintLine("black", 3);

//CREATES the LEFT EYE
  moveSpaces(6);
  paintLine("black", 3);
  turnRight();
  move();
  turnRight();
  paintLine("black", 5);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("black", 5);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("black", 5);
  turnLeft();
  move();
  turnLeft();
  move();
  move();
  paintLine("black", 3);
}
  
public void drawSmile() {
//CREATES the SMILE/mouth
  turnLeft();
  moveSpaces(7);
  turnLeft();
  moveSpaces(3);
  paintLine("black", 2);
  moveSpaces(4);
  paintLine("black", 2);
  turnRight();
  move();
  turnRight();
  paintLine("black", 10);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("black", 10);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("black", 10);
  turnLeft();
  move();
  turnLeft();
  move();
  move();
  paintLine("black", 8);
  turnRight();
  move();
  turnRight();
  move();
  move();
  paintLine("black", 6);
}

public void drawFinish() {
//Finishes the painting by outlining the hat and moving the painter to the corner
  moveSpaces(5);
  turnRight();
  moveSpaces(17);
  paint("black");
  move();
  turnRight();
  move();
  paintLine("black", 3);
  turnLeft();
  move();
  turnRight();
  paintLine("black", 2);
  turnLeft();
  move();
  turnRight();
  paintLine("black", 6);
  turnRight();
  move();
  turnLeft();
  paintLine("black", 2);
  turnRight();
  move();
  turnLeft();
  paintLine("black", 3);
  turnRight();
  move();
  paint("black");
  moveToCorner();
    }
}