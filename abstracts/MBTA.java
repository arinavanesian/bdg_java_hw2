package main.java.com.example.abstracts;

public class MBTA {
  public abstract class Vehicle {
    protected String type;
    protected String rightOfWay;

    public Vehicle(String type, String rightOfWay) {
        this.type = type;
        this.rightOfWay = rightOfWay;
    }

    public abstract void move();
}

public class Bus extends Vehicle {
    public Bus(String rightOfWay) {
        super("Bus", rightOfWay);
    }

    @Override
    public void move() {
        System.out.println("The bus is moving on " + rightOfWay + " right-of-way.");
    }
}

public class UrbanRail extends Vehicle {
    public UrbanRail(String rightOfWay) {
        super("Urban Rail", rightOfWay);
    }

    @Override
    public void move() {
        System.out.println("The urban rail is moving on " + rightOfWay + " right-of-way.");
    }
}

public class CommuterRail extends Vehicle {
    public CommuterRail(String rightOfWay) {
        super("Commuter Rail", rightOfWay);
    }

    @Override
    public void move() {
        System.out.println("The commuter rail is moving on " + rightOfWay + " right-of-way.");
    }
}

 
    public static void main(String[] args) {
      MBTA mbta = new MBTA();
        Vehicle bus = mbta.new Bus("Dedicated");
        Vehicle urbanRail = mbta.new UrbanRail("Shared");
        Vehicle commuterRail = mbta.new CommuterRail("Mixed");

        bus.move();
        urbanRail.move();
        commuterRail.move();
    }
}


