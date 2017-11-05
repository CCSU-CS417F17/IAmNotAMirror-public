package edu.ccsu.cs505.compob;

import java.util.*;

/**
 * This an abstract class and it is Subject class in the observer pattern which will notify the observers if the temperature goes beyond the limit-set
 * @author CS505-Group5
 */

public abstract class SubjectSensor {

	/**
	 * This attribute notifies the observer classes through the object observerDHTSensor
	 */
	public List <ObserverSensor> observers = new ArrayList<>();


	/**
	 * @param o of type ObserverDHTSensor is send as a parameter to add as concrete observer
	 */
	public void addObserver (ObserverSensor o) {
		this.observers.add(o);
	}

	/**
	 * @param o of type ObserverDHTSensor is send as a parameter to delete from concrete observer
	 */
	public void removeObserver (ObserverSensor o) {
		this.observers.remove(o);
	}
   
	/**
	 * This method is used to notify all the observers if there temperature goes beyond the limit-set
	 */
	public void notifyObservers(){
		for( ObserverSensor o: this.observers) {
			o.update();
		}	
	}

}

 