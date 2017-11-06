package edu.ccsu.cs505.compob;

/**
 * @author CS505-Group5
 * This class is a child class of TempObserverWarner
 */

public class LEDObserverWarner extends TempObserverWarner {
  
	/**
	 * This attribute is for warning, whenever it exceeds the threshold of temperature 
	 */
	private double warnTemp;
	
	/**
	 * This attribute is used for warning state with boolean function, wherein 1 stands for warning, 0 stands for normal
	 */
	private boolean warnState;
	

	/**
	 * This Attribute is for the LED to lit up after receiving the warning
	 * @param sub is for the subject
	 * @param temp is for temperature warning
	 */
	public LEDObserverWarner (SubjectDHTSensor sub, double temp) {
		super();
		this.subject = sub;
		this.warnTemp = temp;
		this.warnState = false;
	}

	
	/**
	 * @param subjectDHTSensor notifies on a regular interval of time about any fluctuation in temperature
	 */
	public void update() {
	/**
	* There will be warning once it exceeds the threshold of the temperature
	*/
				if (!this.warnState) {
					if (this.subject.getTemperaturee() > this.warnTemp) {
						warn();
					}
				}
	/**
	* There is no need of warning when the temperature doesn't exceed the threshold
	*/
				else {
					if (this.subject.getTemperaturee() <= this.warnTemp) {
						warnfree();
					}
				}
	}
	
	
	
	/**
     * This method will generate warning by flashing LED, according to temperature from update function.
     */
	private void warn() {
		System.out.println("start warning");
	}
	
	/**
     * This method will not generate warning, according to temperature from update function.
     */
	private void warnfree() {
		System.out.println("no warning");
	}
	
	
	/**
	 * @param temp is to set the update for temperature, so that warning can be generated, when required.
	 */
	public void setWarnTemp (double temp) {
		this.warnTemp = temp;
	}
	
	/**
	 * @return is to get the update for temperature, and warning will be generated accordingly.
	 */
	public double getWarnTemp () {
		return this.warnTemp;
	}

	


	
}

