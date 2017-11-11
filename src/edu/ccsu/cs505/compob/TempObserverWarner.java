package edu.ccsu.cs505.compob;

/**
 * In Observer pattern, this is an abstract class of observer. Also, this class
 * designed by Template pattern, the abstract method warn is the hook method.
 * Each subclass could have their own warn method.
 *
 * @author CS505-Group5
 * @version 1.0
 * @param <SubjectDHTSensor>
 * @since 1.0
 */
public abstract class TempObserverWarner <SubjectDHTSensor extends SubjectSensor> implements ObserverSensor<SubjectDHTSensor>  {

    /**
     * Represents the subject of DHT sensor class.
     */
    public SubjectDHTSensor subject;

    /**
     * Realized from the observer interface. Represents the concrete template
     * method in Template Pattern. Cannot be overridden by sub-class.
     * @param sub, SubjectDHTSensor class.
     */
    @Override
    public final void update(SubjectDHTSensor sub) {
        this.subject = sub;
        //Call Hook method;
        hookOb();
    }

    /**
     * Represents the Hook method in Template Pattern.
     * Must be implemented in concrete class.
     */
    public abstract void hookOb();
}
