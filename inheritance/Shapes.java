package main.java.com.example.inheritance;

public class Shapes {
  abstract class Shape{
    abstract String shapeName();
    abstract void draw();
  }
  class Rectangle extends Shape{
    String shapeName(){
      return this.getClass().getSimpleName();
    }
    void draw(){
      System.out.println("Drawing a "  + shapeName().toLowerCase());
    }
  }
  class Circle extends Shape{
    String shapeName(){
      return this.getClass().getSimpleName();
    }
    void draw(){
      System.out.println("Drawing " + shapeName().toLowerCase());
    }
  }
  class Triangle extends Shape{
    String shapeName(){
      return this.getClass().getSimpleName();
    }
    void draw(){
      System.out.println("Drawing " + shapeName().toLowerCase());
    }
  }
  public static void main(String[] args) {
    Shapes shapes = new Shapes();
    Rectangle rec = shapes.new Rectangle();
    System.out.println(rec.shapeName());
    rec.draw();
    }
}
