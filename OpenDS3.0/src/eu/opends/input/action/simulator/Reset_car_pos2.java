package eu.opends.input.action.simulator;

import eu.opends.car.SteeringCar;
import eu.opends.input.SimulatorActionListener;
import eu.opends.main.Simulator;

public class Reset_car_pos2 {
  public static void action(boolean value) {
    Simulator sim = SimulatorActionListener.getSimulator();
    SteeringCar car = SimulatorActionListener.getCar();
    if (value)
    {
        sim.getSteeringTask().getPrimaryTask().reportBlinkingRight();
        car.setToResetPosition(1);
    }
  }
}
