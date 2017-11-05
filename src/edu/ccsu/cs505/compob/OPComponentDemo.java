package edu.ccsu.cs505.compob;

public class OPComponentDemo {

	public static void main(String[] args) {

		SubjectDHTSensor dhtSensor = new SubjectDHTSensor();
		LEDObserverWarner ledWarner = new LEDObserverWarner(dhtSensor, 30);
		dhtSensor.addObserver(ledWarner);
	}

}
