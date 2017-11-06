package edu.ccsu.cs505.compob;

import java.util.*;


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