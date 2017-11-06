package edu.ccsu.cs505.compob;

import java.util.*;

/**
 * This is an abstract subject class in the observer pattern. It has a list
 * attributes which used to store the observers. An addObserver and an
 * removeObserver methods used to maintain the observer lists. Subject use
 * notifyObservers function to notify all the observers in observer list
 * recursively.
 *
 * @author CS505-Group5
 * @version 1.0
 * @since 1.0
 */
public abstract class SubjectSensor {

	public List<ObserverSensor> observers = new ArrayList<>();

	
	public void addObserver(ObserverSensor o) {
		this.observers.add(o);
	}

	
	public void removeObserver(ObserverSensor o) {
		this.observers.remove(o);
	}

	public void notifyObservers() {
		for (ObserverSensor o : this.observers) {
			o.update();
		}
	}

}