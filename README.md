This sample code will showcase how raspberryPi can be used with an observer pattern where multiple observer can be added by the user.

This Component Interface, can be used by any other team/group working with raspberryPi and/or on Smart Mirror.

The working model of this component is based on Observer Pattern, where Sensor is the Subject class which will have multiple observers like LED, buzzer etc.

The abstract class SubjectSensor can be used for example Temperature Sensor. This Temperature Sensor Subject can have multiple Observers which can be implemented through ObserverSensor interface.

These multiple observers can be added through addObserver (ObserverSensor o) method defined in abstract SubjectSensor class. Similarly each of these observer can be removed through removeObserver(ObserverSensor o)method.

The interface is designed in such a way, that the SubjectSensor i.e. Temperature Sensor will update the Observers at regular intervals
about the change in the temperature. Based on these updates the observers act upon.

The interface ObserverSensor of observer pattern is implement by abstract class TempObserverWarner. Through this abstract class multiple
observers can be added like how LEDObserverWarner is added. 

Also this abstract class TempObserverWarner is showcasing Template pattern as well. It has concrete template method update() which is
calling the abstract hook method hookOb().

Similarly different observers like other Buzzer etc can be added here as observers as the child classes of TempObserverWarner.

