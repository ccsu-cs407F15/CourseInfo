package edu.ccsu.cs407.vehicleFactoryMethod;

/**
 * BaseEngine for a motorized vehicle
 */
public class BaseEngine implements Engine{
  private final double horsePower;
  private final double soundMultiplier;
  public BaseEngine(double horsePower,double soundMultiplier){
    this.horsePower = horsePower;
    this.soundMultiplier = soundMultiplier;
  }
  
  public double getEngineSound(){
    return horsePower * soundMultiplier;
  }
}
