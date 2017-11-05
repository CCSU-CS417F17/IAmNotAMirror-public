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
    }

    @Test
    void testremoveObserver() throws IOException, InterruptedException, Exception{

    

    }

}