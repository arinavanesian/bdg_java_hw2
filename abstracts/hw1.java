package main.java.com.example.abstracts;

public class hw1 {
  abstract class Parent {
    public Parent(){
      System.out.println("Parent is called");
    }
    abstract void message();
  }
  class  ChildOne extends Parent{
    public ChildOne(){
      System.out.println("ChildOne is called");
    }
    public void message(){
      System.out.println("This is first subclass" );
    }
  }
  class  ChildSecond extends Parent{
    public ChildSecond(){
      System.out.println("ChildSecond is called");
    }
    public void message(){
        System.out.println("This is second subclass" );
      }
    }
  public static void main(String[] args) {
    hw1 hw = new hw1();
    ChildOne one = hw.new ChildOne();
    ChildSecond second = hw.new ChildSecond();
    one.message();
    second.message();
  }
}
