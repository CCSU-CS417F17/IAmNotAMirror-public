package edu.ccsu.cs505.compob;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Timer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dexterind.grovepi.sensors.DHTDigitalSensor;

public class SubjectDHTSensorTest {

	/** Test Construction of object **/
	@Test
	public void TestConstruction() throws IOException, InterruptedException, Exception {
		
		SubjectDHTSensor subjectDHTSensor = new SubjectDHTSensor(5.5);
		assertEquals(subjectDHTSensor.getInterval(),5.5, 0 );
		
		SubjectDHTSensor subjectDHTSensor1 = new SubjectDHTSensor(0, 5.5);
		assertEquals(subjectDHTSensor1.getInterval(),5.5, 0 );
		
	}
	
	
	/** Test getTemperature(), getHumidity(), getInterval() **/
	@Test
	public void TestGetter() throws IOException, InterruptedException, Exception {
		
		SubjectDHTSensor instance1 = new SubjectDHTSensor();

		double roomtemp= 30;
		assertEquals("equals" ,roomtemp,instance1.getTemperature(),0);
		
		double roomhumid =40;
		assertEquals("equals" ,roomhumid,instance1.getHumidity(),0);
		
		double interval =10;
		assertEquals("equals" ,interval,instance1.getInterval(),0);	
		
	}
	
	/** Test read() **/
	@Test
	public void ReadTest() throws IOException, InterruptedException, Exception {
		
		SubjectDHTSensor instance1 = new SubjectDHTSensor();
		
		DHTDigitalSensor dhtSensor = null;
		float data[] = dhtSensor.read();
		double temp;
		temp= data[0];
				
		assertEquals("equals" ,temp,instance1.getTemperature(),0);	
		
	}
	
	
}
