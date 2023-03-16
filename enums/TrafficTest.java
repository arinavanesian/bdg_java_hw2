package main.java.com.example.enums;
public class TrafficTest {
  public static void main(String[] args) throws InterruptedException {
      TrafficLight trafficLight = new TrafficLightImpl();
      trafficLight.run();
  }
}
