import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write the RocketPainter class to create a mural of a rocket.
     * Then, instantiate a RocketPainter object and paint the mural.
     * -----------------------------------------------------------------------------
     */

   //new Painter named justinoh 
  SpikePainter sina = new SpikePainter();

  //Painter will paint a yellow background  
  sina.paintBackground("yellow", 32);

  //new Painter named taaj 
  SpikePainter taaj = new SpikePainter();
    
  //Painter will paint the final product from the SpikePainter.java
  taaj.drawSpike();
      
  }
}