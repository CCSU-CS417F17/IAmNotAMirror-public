package edu.ccsu.cs505.compob;

/**
 * In Observer pattern, this is the interface of observers.
 * Each concrete observer should realize it. 
 *
 * @author CS505-Group5
 * @version 1.0
 * @param <T>, extends from SubjectSensor class
 * @since 1.0
 */
public interface ObserverSensor <T extends SubjectSensor>{

    /**
     * This public function could be called by subject, the observer would get 
     * update information from subject 
     * @param sub, SubjectSensor class
     */
    public void update(T sub);
}
