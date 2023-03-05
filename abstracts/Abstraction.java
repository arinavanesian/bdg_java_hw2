package main.java.com.example.abstracts;
public class Abstraction{
  
  abstract class Employee {
    abstract int raise(final int r);
    // abstract prompotion from Sales to Finance
  }
  class Sales extends Employee{
    int salary =100;
    int raise(final int r){
      this.salary +=r;
      return this.salary;
    }
  }
  class Finance extends Employee{
    int salary =200;
    int raise(final int r){
      this.salary +=r;
      return this.salary;
    }
    
  }
  public static void main(String[] args) {
    
  }
}