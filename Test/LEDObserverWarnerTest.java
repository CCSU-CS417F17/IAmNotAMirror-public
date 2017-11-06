package blackberrypi;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.dexterind.grovepi.sensors.Led;
import com.dexterind.grovepi.sensors.base.SensorStatus;

public class LEDObserverWarnerTest {

public LEDObserverWarnerTest(){
		
	}
	private Led ledWarner;

	@Test
	public void testUpdate() throws IOException, InterruptedException, Exception {
		double warnTemp=30;
		double sensorTemp= 40;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor ();
		assertEquals("equals" ,sensorTemp,instanceSub.getTemperature(),0);
		
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		assertEquals("equals",warnTemp,instanceLed.getWarnTemp(),0);
		
	}
	
	
	


}
