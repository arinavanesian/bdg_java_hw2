package main.java.com.example.abstracts;


public class MyClass implements  A
{ //cannot find symbol(please examine)
public  void methOne() {
  System.out.println("methOne is static and working");
}
public void methSecond(){
  System.out.println("methSecond is working");
}

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.methOne();
    mc.methSecond();
  }
}
