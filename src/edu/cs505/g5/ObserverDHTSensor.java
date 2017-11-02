package MagicMirror2;

/**
 * This is an interface
 * @author CS505-Group5
 */
public interface ObserverDHTSensor {
	
	/**
	 * @param subjectDHTSensor notifies on a regular interval of time
	 */
	
  public void update(SubjectDHTSensor subjectDHTSensor);

}
