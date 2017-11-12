This sample code will showcase how raspberryPi can be used with an observer pattern where multiple observer can be added by the user.

This Component Interface, can be used by any other team/group working with raspberryPi and/or on Smart Mirror.

The working model of this component is based on Observer Pattern, where Sensor is the Subject class which will have multiple observers like LED, buzzer etc.

The abstract class SubjectSensor can be used for example Temperature Sensor. This Temperature Sensor Subject can have multiple Observers which can be implemented through ObserverSensor interface.

These multiple observers can be added through addObserver (ObserverSensor o) method defined in abstract SubjectSensor class. Similarly each of these observer can be removed through removeObserver(ObserverSensor o)method.
