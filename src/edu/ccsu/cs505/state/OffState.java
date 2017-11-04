package edu.ccsu.cs505.state;

import java.util.Vector;

/**
 * This class extends RaspberriPiState and observer sends a notification (to the user) that RaspberryPi is going to switch off
 * @author CS505-Group5
 */
public class OffState extends RasberryPiState {

    /**
     * This observer sends a notification (to the user) that RaspberryPi is going to switch off
     */
    public Vector myObserverNotification;

}
