package edu.ccsu.cs505.compob;

/**
 * @author Anil
 * This class implements the interface ObserverSensor
 */
public abstract class TempObserverWarner implements ObserverSensor {

	/**
	 * This attribute warns about the rise and fall of the temperature.
	 */
	public SubjectDHTSensor subject;
	
	
	/**
	 * This method updates the temperature to the SubjectDHTSensor class.
	 */
	public abstract void update();
}

