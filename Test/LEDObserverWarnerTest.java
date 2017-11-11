package edu.ccsu.cs505.compob;

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
	public void test() throws IOException, InterruptedException, Exception {
		double warnTemp=30;
		double sensorTemp= 40;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor ();
		assertEquals("equals" ,sensorTemp,instanceSub.getTemperature(),0);
		
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		assertEquals("equals",warnTemp,instanceLed.getWarnTemp(),0);
		
	}
	/*
	@Test
	public void testUpdateTempLess() throws IOException, InterruptedException, Exception{
		double warnTemp=30;
		double sensorTemp= 20;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor ();
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		instanceLed.update();
		SensorStatus ExpectedResult = SensorStatus.OFF;
		SensorStatus result = this.ledWarner.getStatus();
		assertEquals(ExpectedResult, result);
	}
	
	
	@Test
	public void testUpdateTempGreater() throws IOException, InterruptedException, Exception{
		double warnTemp=30;
		double sensorTemp= 20;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor ();
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		instanceLed.update();
		SensorStatus ExpectedResult = SensorStatus.ON;
		SensorStatus result = this.ledWarner.getStatus();
		assertEquals(ExpectedResult, result);
	} */
	/*
	@Test
	public void testHookOb1() throws IOException, InterruptedException, Exception{
		double warnTemp=30;
		double sensorTemp= 50;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor();
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		instanceLed.hookOb();
		SensorStatus ExpectedResult = SensorStatus.ON;
		SensorStatus Actualresult = this.ledWarner.getStatus();
		assertEquals(ExpectedResult, Actualresult);
	}
		*/
	@Test
	public void testHookOb1() throws IOException, InterruptedException, Exception{
		double warnTemp=30;
		double sensorTemp= 50;
		SensorStatus PreviousStatus = SensorStatus.ON;
		SubjectDHTSensor instanceSub = new SubjectDHTSensor();
		LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
		instanceLed.hookOb();
		SensorStatus CurrentStatus = this.ledWarner.getStatus();// this will return status as ON as temp continues to be higher than warning temp			
		assertEquals(PreviousStatus,CurrentStatus);
		
	}
	
		@Test
		public void testHookOb2() throws IOException, InterruptedException, Exception{
			double warnTemp=30;
			double sensorTemp= 20;
			SensorStatus PreviousStatus = SensorStatus.OFF;
			SubjectDHTSensor instanceSub = new SubjectDHTSensor();
			LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
			instanceLed.hookOb();	
			SensorStatus CurrentStatus = this.ledWarner.getStatus();	//This will return status as OFF since temp continues to be lower than warning temp
			assertEquals(PreviousStatus,CurrentStatus);
	}
		
		@Test
		public void testHookOb3() throws IOException, InterruptedException, Exception{
			double warnTemp=30;
			double sensorTemp= 50;
			SensorStatus PreviousStatus = SensorStatus.OFF;
			SubjectDHTSensor instanceSub = new SubjectDHTSensor();
			LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
			instanceLed.hookOb();	
			SensorStatus CurrentStatus = this.ledWarner.getStatus();	//This will return status as ON since temperature has become higher than warning temp
			assertNotEquals(PreviousStatus,CurrentStatus);
	}
		
		@Test
		public void testHookOb4() throws IOException, InterruptedException, Exception{
			double warnTemp=30;
			double sensorTemp= 20;
			SensorStatus PreviousStatus = SensorStatus.ON;
			SubjectDHTSensor instanceSub = new SubjectDHTSensor();
			LEDObserverWarner instanceLed = new LEDObserverWarner(instanceSub, warnTemp, 1);
			instanceLed.hookOb();	
			SensorStatus CurrentStatus = this.ledWarner.getStatus();	//This will return status as OFF since temp has become lower than warning temp	
			assertNotEquals(PreviousStatus,CurrentStatus);
	}
		
}
