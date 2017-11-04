package edu.ccsu.cs505.compob;

/**
 * This class also implements the interface ObserverDHTSensor
 * Observer State is an attribute
 * @author CS505-Group5
 */
public class LEDObserverWarner extends TempObserverWarner {

	public int observerState;

	/**
	 * @param subjectDHTSensor notifies on a regular interval of time
	 */
	public void update(SubjectDHTSensor sub) {
	}
	
	
	/**
     * Warn by flashing LED, according to temperature from update function.
     * 
     */
	private void warn() {
		
	}
}
