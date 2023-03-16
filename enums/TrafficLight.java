package main.java.com.example.enums;

public abstract class TrafficLight {
  public enum State {
      RED, YELLOW, GREEN;

      public State getNext() {
          return this.ordinal() < State.values().length - 1
                  ? State.values()[this.ordinal() + 1]
                  : State.values()[0];
      }
  }

  public abstract void changeState(State state);

  public void run() throws InterruptedException {
      State currentState = State.RED;

      while (true) {
          Thread.sleep(3000);
          currentState = currentState.getNext();
          changeState(currentState);
      }
  }
}


