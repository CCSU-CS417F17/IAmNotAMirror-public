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

	@Test
	public void Test() throws IOException, InterruptedException, Exception {
		
		SubjectDHTSensor instance1 = new SubjectDHTSensor();

		double roomtemp= 30;
		assertEquals("equals" ,roomtemp,instance1.getTemperature(),0);
		
		double roomhumid =40;
		assertEquals("equals" ,roomhumid,instance1.getHumidity(),0);
		
		double interval =10;
		assertEquals("equals" ,interval,instance1.getInterval(),0);	
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test1() throws IOException, InterruptedException, Exception {
		
		SubjectDHTSensor instance1 = new SubjectDHTSensor();
		
		DHTDigitalSensor dhtSensor = null;
		float data[] = dhtSensor.read();
		double temp;
		temp= data[0];
				
		assertEquals("equals" ,temp,instance1.getTemperature(),0);	
		
	}
	
	
}
