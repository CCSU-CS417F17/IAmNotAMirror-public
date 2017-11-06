package edu.ccsu.cs505.compob;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.dexterind.grovepi.sensors.Led;


/**
 * This class implements the interface ObserverSensor and it is sub-class of
 * Template class. 
 * This is observer class in the observer pattern. This class has an attribute
 * class Led, which is imported from Professor Williams' example inGrovePi package. 
 * If the observer get updated temperature from subject class, and the temperature
 * is higher than warning temperature, it will turn on the LED light to warn.
 *
 * @author CS505-Group5
 * @version 1.0
 * @since 1.0
 */
public class LEDObserverWarner extends TempObserverWarner {

    /**
     * Represents the warning temperature
     */
    private double warnTemp;

    /**
     * Represents the warning state, true means on warning, false is not.
     */
    private boolean warnState;

    /**
     * Represents LED sensor class from GrovePi.
     */
    private Led ledWarner;


    /**
     * Constructor.
     *
     * @param sub, SubjectDHTSensor class.
     * @param temp , temperature.
     * @param ledNum, Led pin number.
     *
     */
    public LEDObserverWarner(SubjectDHTSensor sub, double temp, int ledNum) {
        super();
        this.subject = sub;
        this.warnTemp = temp;
        this.warnState = false;

        try {
            this.ledWarner = new Led(ledNum);
            ledWarner.turnOff();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Get update information from subject.
     */
    @Override
    public void update() {
        //If not warning
        if (!this.warnState) {
            if (this.subject.getTemperature() > this.warnTemp) {
                warn();
                this.warnState = true;

            }
        } //if it has been warning.
        else {
            if (this.subject.getTemperature() <= this.warnTemp) {
                try {
                    warnfree();
                    this.warnState = false;
                } catch (IOException ex) {
                    Logger.getLogger(LEDObserverWarner.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    /**
     * Warn by flashing LED, according to temperature from update function.
     *
     */
    @Override
    public void warn() {
        try {
           this.ledWarner.turnOn();
           System.out.println("Warning");
        System.out.println("start warning"); 
        } catch (IOException ex) {
            Logger.getLogger(LEDObserverWarner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Release warning LED, according to temperature from update function.
     *
     */
    private void warnfree() throws IOException {
        this.ledWarner.turnOff();
        System.out.println("no warning");
    }

    /**
     * Set WarnTemp.
     * @param temp     
     */
    public void setWarnTemp(double temp) {
        this.warnTemp = temp;
    }

    /**
     * Gets warning temperature.
     *
     * @return warnTemp
     */
    public double getWarnTemp() {
        return this.warnTemp;
    }

}
