package edu.ccsu.cs505.compob;

import java.util.*;

/**
 *
 * @author CS505-Group5
 */


/**
 * This class is the Subject class in the observer pattern which will notify the observers if the temperature goes beyond the limit-set
 */
public abstract class SubjectSensor {

	
    /**
     * Because the SubjectDHTSensor calls the interface Observer and all other classes that implement that interface as well
     */

	/**
	 * this class notifies the observer classes through the object observerDHTSensor
	 */
	public List <ObserverSensor> observers = new ArrayList<>();



	/**
	 * @param o of type ObserverDHTSensor is send as a parameter to add as concrete observer
	 */
	public void registerObserver (ObserverSensor o) {
	
	}

	/**
	 * @param o of type ObserverDHTSensor is send as a parameter to delete from concrete observer
	 */
	public void removeObserver (ObserverSensor o) {
		
	}
   
	/**
	 * This method is used to notify all the observers if there temperature goes beyond the limit-set
	 */
	public void notifyObservers(){
		
	}

}
