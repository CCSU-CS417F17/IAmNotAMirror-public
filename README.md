

These multiple observers can be added through addObserver (ObserverSensor o) method defined in abstract SubjectSensor class. Similarly each of these observer can be removed through removeObserver(ObserverSensor o)method. 

The interface is designed in such a way, that the Subject Sensor I.e. Temperature Sensor will update the Observers at regular intervals about the change in temperature. Based on these updates the observers act upon.
