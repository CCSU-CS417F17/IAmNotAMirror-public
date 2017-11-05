package edu.ccsu.cs505.compob;

public abstract class TempObserverWarner implements ObserverSensor {

	public SubjectDHTSensor subject;
	
	@Override
	public abstract void update();
}
