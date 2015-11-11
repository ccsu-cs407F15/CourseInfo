package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.enumeration.Direction;

/**
 * Movement powered by engine
 */
public class EnginePowered implements MovementStrategy{

  @Override
  public void move(Direction d) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public EnginePowered clone(){
    return new EnginePowered();
  }
}
