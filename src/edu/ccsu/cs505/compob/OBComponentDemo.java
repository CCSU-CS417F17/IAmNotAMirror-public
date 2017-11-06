package MagicMirror2;

import java.io.IOException;

/**
 * This is a demo about how to using our component. Anyone who wants to use this
 * component, just need to initialize the SubjectDHTSensor, which is the subject
 * in Observer Pattern. The next step is initializing an observer class. In our
 * demo, we are using our own LEDObserverWarner as an observer. Last step is
 * register its observers class on subject by addObserver method. After the
 * above steps, the subject would run automatically and send notify message to
 * observers by interval time.
 *
 *
 * @author CS505-Group5
 * @version 1.0
 * @since 1.0
 */
public class OBComponentDemo {

    public static void main(String[] args) throws IOException, InterruptedException, Exception {

        /**
         * Initialize the subject DHT Sensor by scale(C) and interval(seconds);
         */
        SubjectDHTSensor dhtSensor = new SubjectDHTSensor(0, 5);

        /**
         * Initialize the observer by subject class, warn temperature and PIN
         * number on Grove Pi;
         */
        LEDObserverWarner ledWarner = new LEDObserverWarner(dhtSensor, 20, 2);

        /**
         * Register observer on subject.
         */
        dhtSensor.addObserver(ledWarner);
    }

}

