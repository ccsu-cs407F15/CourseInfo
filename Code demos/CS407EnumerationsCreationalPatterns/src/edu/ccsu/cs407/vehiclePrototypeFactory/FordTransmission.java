/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;
import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 *
 * @author cw1491
 */
public class FordTransmission implements Transmission{
  public FordTransmission clone(){
    return new FordTransmission();
  }
}
