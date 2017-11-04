package edu.ccsu.cs505.compob;


import java.util.*;


public class SubjectDHTSensor extends SubjectSensor {
	
	public List <ObserverSensor> observers = new ArrayList<>();
	
	private double interval;
	private double temperature;
	private double humidity;
	private DHTDigitalSensor sensor;
	
	/**
     * Read temperature and humidity from 
     * DHTDigitalSensor's read function
     */
	private void read() {
		
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
