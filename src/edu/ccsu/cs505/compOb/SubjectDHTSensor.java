p
package edu.ccsu.cs505.g5;
/**
 *
 * @author CS505-Group5
 */
import java.util.Vector;
/**
 * This class is the Subject class in the observer pattern which will notify the observers if the temperature goes beyond the limit-set
 */
public class SubjectDHTSensor {
    
    /**
     * Because the SubjectDHTSensor calls the interface Observer and all other classes that implement that interface as well
     */
        private ObserverLED ledObserver = new ObserverLED();
  private ObserverBuzzer buzzerObserver = new ObserverBuzzer();
  private ObserverNotification notificationObserver = new ObserverNotification();
  
  /**
         * this class notifies the observer classes through the object observerDHTSensor
         */
  public ObserverDHTSensor observerDHTSensor;

/**
 * This method is used to notify all the observers if there temperature goes beyond the limit-set
 */
    public void sendNotify () {
      
    }
/**
 * @param o of type ObserverDHTSensor is send as a parameter to add as concrete observer 
 */
    public void attch (ObserverDHTSensor o) {
      
    }
    
  /**
   * @param o of type ObserverDHTSensor is send as a parameter to delete from concrete observer 
   */

   public void detach (ObserverDHTSensor o) {
     
   }

}