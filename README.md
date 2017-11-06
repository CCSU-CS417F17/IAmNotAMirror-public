This is the reusable Component Interface, which can be used by any other team/group working with raspberryPi and on Smart Mirror concept.

The working model is based on Observer Pattern, where Sensor is the Subject class which will have multiple observers like LED, buzzer etc.

These multiple observers can be added through addObserver (ObserverSensor o) method defined in abstract SubjectSensor class. Similarly each of these observer can be removed through removeObserver(ObserverSensor o)method. 

The interface is designed in such a way, that the Subject Sensor I.e. Temperature Sensor will update the Observers at regular intervals about the change in temperature. Based on these updates the observers act upon.


