package main.java.com.example.inheritance;
// import main.java.com.example.inheritance.*;

public class T1 {
public T1(){
  System.out.println("T1 is printed");
}
private int getNumberOfHumps() { // DOES NOT COMPILE
  return 2;
  }
public static void main(String[] args) {
  
  T1 t1  = new T1();
  Test t = new Test();
   System.out.println(t1.getNumberOfHumps());
   System.out.println(t.getNumberOfHumps());
  }
}

