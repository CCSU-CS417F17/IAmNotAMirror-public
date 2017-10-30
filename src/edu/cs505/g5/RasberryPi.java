/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs505.g5;
/**
 *
 * @author madhavimalarouth,vanya,Anil Kumar,Hiral Depani, Yao Wei
 */
import java.util.Vector;

/**
 * The RasberryPi class is the context class in the State Pattern which is implementing the interface RasberryPiStateChange
 * 
 */
public class RasberryPi implements RasberryPiStateChange {
   
/**
 * Because the RasberryPi class has to access the SubjectDHTSensor class, a dhtsensor object is created
 */
  public SubjectDHTSensor dhtsensor;
  /**
   * Defining the signature of the class
   */
  public void setRasberryPiState() {
  }

}