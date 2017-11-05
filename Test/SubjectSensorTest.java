package edu.ccsu.cs505.compob;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;


class SubjectSensorTest {

    @Test
    void testaddObserver() throws IOException, InterruptedException, Exception {
     
      SubjectDHTSensor dhtSensor = new SubjectDHTSensor(0, 5);
        LEDObserverWarner ledWarner1 = new LEDObserverWarner(dhtSensor, 30, 2);
        dhtSensor.addObserver(ledWarner1);
        SubjectSensor subjectSensorInstance = new SubjectSensorImp();
        assertEquals(ledWarner1,subjectSensorInstance.observers.get(0));

        LEDObserverWarner ledWarner2 = new LEDObserverWarner(dhtSensor, -5, 2);
        dhtSensor.addObserver(ledWarner2);
        assertEquals(ledWarner2,subjectSensorInstance.observers.get(1));
    }

    @Test
    void testremoveObserver() throws IOException, InterruptedException, Exception{
		SubjectDHTSensor dhtSensor = new SubjectDHTSensor(0, 5);
        LEDObserverWarner ledWarner1 = new LEDObserverWarner(dhtSensor, 30, 2);
        dhtSensor.addObserver(ledWarner1);
        SubjectSensor subjectSensorInstance = new SubjectSensorImp();

        LEDObserverWarner ledWarner2 = new LEDObserverWarner(dhtSensor, -5, 2);
        dhtSensor.addObserver(ledWarner2);

        dhtSensor.removeObserver(ledWarner2);

        assertEquals(null,subjectSensorInstance.observers.get(1));

    

    }

}