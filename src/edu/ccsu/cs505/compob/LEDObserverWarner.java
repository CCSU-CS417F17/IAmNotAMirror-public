package edu.ccsu.cs505.compob;

/**
 * This class also implements the interface ObserverDHTSensor
 * Observer State is an attribute
 * @author CS505-Group5
 */
public class LEDObserverWarner extends TempObserverWarner {

	//used to define warning temperature  
	private double warnTemp;
	
	//used to define warning state, 1 means on warning, 0 means not.
	private boolean warnState;
	

	public LEDObserverWarner (SubjectDHTSensor sub, double temp) {
		super();
		this.subject = sub;
		this.warnTemp = temp;
		this.warnState = false;
	}

	
	/**
	 * @param subjectDHTSensor notifies on a regular interval of time
	 */
	@Override
	public void update() {
		//If not warning
				if (!this.warnState) {
					if (this.subject.getTemperaturee() > this.warnTemp) {
						warn();
					}
				}
				//if it has been warning.
				else {
					if (this.subject.getTemperaturee() <= this.warnTemp) {
						warnfree();
					}
				}
	}
	
	
	
	/**
     * Warn by flashing LED, according to temperature from update function.
     * 
     */
	private void warn() {
		System.out.println("start warning");
	}
	
	/**
     * Release warning LED, according to temperature from update function.
     * 
     */
	private void warnfree() {
		System.out.println("no warning");
	}
	
	
	public void setWarnTemp (double temp) {
		this.warnTemp = temp;
	}
	
	public double getWarnTemp () {
		return this.warnTemp;
	}

	


	
}
