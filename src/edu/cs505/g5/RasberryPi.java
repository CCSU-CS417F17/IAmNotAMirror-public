
package edu.ccsu.cs505.g5;
/**
 *
 * @author CS505-Group5
 */
import java.util.Vector;

/**
 * The RasberryPi class is the context class in the State Pattern which is implementing the interface RasberryPiStateChange
 * 
 */
public class RasberryPi implements RasberryPiStateChange {
   
/**
 * Because the RasberryPi class has to access the SubjectDHTSensor class, a dhtsensor object is created
 */
  public SubjectDHTSensor dhtsensor;
  /**
   * Defining the signature of the class
   */
  public void setRasberryPiState() {
  }

}