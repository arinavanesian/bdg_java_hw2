package main.java.com.example.enums;

public class TrafficLightImpl extends TrafficLight {
  @Override
  public void changeState(State state) {
      switch (state) {
          case RED:
              System.out.println("Traffic Light is RED");
              break;
          case YELLOW:
              System.out.println("Traffic Light is YELLOW");
              break;
          case GREEN:
              System.out.println("Traffic Light is GREEN");
              break;
          default:
              System.out.println("Invalid state");
              break;
      }
  }
}
