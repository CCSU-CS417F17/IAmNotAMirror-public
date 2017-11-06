package edu.ccsu.cs505.compob;

/**
 * In Observer pattern, this is an abstract class of observer. 
 * Also, this class designed by Template pattern, the abstract method warn is 
 * the hook method. Each subclass could have their own warn method.
 *
 * @author CS505-Group5
 * @version 1.0
 * @since 1.0
 */
public abstract class TempObserverWarner implements ObserverSensor {
    /**
     * Represents the subject of DHT sensor class.
     */
    public SubjectDHTSensor subject;

    /**
     * Abstract method realized from the observer interface. 
     */
    @Override
    public abstract void update();
    
    /**
     * Represents the Hook method in Template Pattern.
     */
    public abstract void warn();
}
