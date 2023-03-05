package main.java.com.example.abstracts;

public class Homework8 {
  public abstract class AbstractPrint{
    public AbstractPrint(){
      System.out.println("This is constructor of abstract class");
    }
    public abstract void a_method();
      protected void normal_method() {
        System.out.println(
          "This is a normal method of abstract class");
      }
  }
  class SubClass extends AbstractPrint{
public SubClass(){
  System.out.println("This is constructor of a concrete subclass");
}

@Override
public void a_method() {

  // TODO Auto-generated method stub
  System.out.println("This is abstract method");
}

  }
  public static void main(String[] args) {
    Homework8 h = new Homework8();
    SubClass sub = h.new SubClass();
    sub.a_method();
    sub.normal_method();
  }
}
