package edu.ccsu.cs505.compob;

/**
 * This is an interface
 * @author CS505-Group5
 */
public interface ObserverSensor {
	/**
	 * @param sub notifies on a regular interval of time
	 */
	public void update(SubjectSensor sub);

}
