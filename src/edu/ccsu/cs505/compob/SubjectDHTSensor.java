package edu.ccsu.cs505.compob;

import java.util.*;
import java.util.TimerTask;
import com.dexterind.grovepi.sensors.*;


public class SubjectDHTSensor extends SubjectSensor {
	
	public List <ObserverSensor> observers = new ArrayList<>();
	
	private double interval;
	private double temperature;
	private double humidity;
	private int scale = 0;
	private DHTDigitalSensor dhtSensor;
	

	public SubjectDHTSensor() {
		super();
		this.dhtSensor = new DHTDigitalSensor(1, 0, this.scale);
		startTimer();
	}
	
	public SubjectDHTSensor(double interval) {
		super();
		this.interval = interval;
		this.dhtSensor = new DHTDigitalSensor(1, 0, this.scale);
		startTimer();
	}
	
	public SubjectDHTSensor(int scale, double interval) {
		super();
		this.scale = scale;
		this.interval = interval;
		this.dhtSensor = new DHTDigitalSensor(1, 0, this.scale);
		startTimer();
	}
	
	private void startTimer() {
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			public void run() {
				read();
				notifyObservers();
			}
		}, (long) interval);
	}

	
	/**
     * Read temperature and humidity from 
     * DHTDigitalSensor's read function
     */
	private void read() {
		float data[] = this.dhtSensor.read();
		this.temperature = data[0];
		this.humidity = data[1];
	}
	
    /**
     * This method is called by concrete observer classes when they are getting updated
     */
	public double getTemperaturee() {
		return this.temperature;
	}
	
    /**
     * This method is called by concrete observer classes when they are getting updated
     */
	public double getHumidity() {
		return this.humidity;
	}
	
    /**
     * This method is called by concrete observer classes when they are getting updated
     */
	public double getInterval() {
		return this.interval;
	}
	
	
}
