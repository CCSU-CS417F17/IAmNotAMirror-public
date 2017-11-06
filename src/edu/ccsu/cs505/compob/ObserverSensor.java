package edu.ccsu.cs505.compob;

/**
 * In Observer pattern, this is the interface of observers.
 * Each concrete observer should realize it. 
 *
 * @author CS505-Group5
 * @version 1.0
 * @since 1.0
 */
public interface ObserverSensor {

    /**
     * This public function could be called by subject, the observer would get 
     * update information from subject 
     */
    public void update();
}

