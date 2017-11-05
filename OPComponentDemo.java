package edu.ccsu.cs505.compob;

/**
 * @author CS505-Group5
 * This class demonstrates the implementation of the components.
 */
public class OPComponentDemo {

	/**
	 * This is how Subject and Observer will be defined.
	 */
	public static void main(String[] args) {

		SubjectDHTSensor dhtSensor = new SubjectDHTSensor();
		LEDObserverWarner ledWarner = new LEDObserverWarner(dhtSensor, 30);
		dhtSensor.addObserver(ledWarner);
	}

}

