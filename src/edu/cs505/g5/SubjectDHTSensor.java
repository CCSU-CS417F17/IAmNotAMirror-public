package edu.ccsu.cs505.g5;

import java.util.Vector;

/*
 */
public class SubjectDHTSensor {

	private ObserverLED ledObserver = new ObserverLED();
	private ObserverBuzzer buzzerObserver = new ObserverBuzzer();
	private ObserverNotification notificationObserver = new ObserverNotification();
	
	
	public ObserverDHTSensor observerDHTSensor;


    public void sendNotify () {
    	
    }

    public void attch (ObserverDHTSensor o) {
    	
    }
  

   public void detach (ObserverDHTSensor o) {
	   
   }

}